package com.example.dingke.transwel;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Irish_Meals extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.irish_meals);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageButton imageButton183 = (ImageButton) findViewById(R.id.imageButton183);

        imageButton183.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Meals.this,Irish_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton185 = (ImageButton) findViewById(R.id.imageButton185);

        imageButton185.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Meals.this,Irish_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton186 = (ImageButton) findViewById(R.id.imageButton186);

        imageButton186.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Meals.this,Irish_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton187 = (ImageButton) findViewById(R.id.imageButton187);

        imageButton187.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Meals.this,Irish_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton149);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much is...?", "Cé mhéad?", R.raw.irish_16howmuch);
                                       }
                                   }
        );


        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton150);

        idlike.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I would like...", "Ba mhaith liom...", R.raw.irish_17idlike);
                                      }
                                  }
        );

        ImageButton vegetarian = (ImageButton) findViewById(R.id.imageButton151);

        vegetarian.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("I am vegetarian", "Is feoilséantóir mé", R.raw.irish_18vegetarian);
                                          }
                                      }
        );

        ImageButton allergy = (ImageButton) findViewById(R.id.imageButton152);

        allergy.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("I have allergies", "Tá alléirge orm i leith...", R.raw.irish_19allergy);
                                       }
                                   }
        );

        ImageButton water = (ImageButton) findViewById(R.id.imageButton153);

        water.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Can I have a glass of water?", "Ba mhaith liom gloine uisce", R.raw.irish_20glasswater);
                                     }
                                 }
        );



    }



    public void translation(String title, String message, final int audio) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle(title);

        // set dialog message
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Play", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // add audio
                        startAudio(audio);


                    }
                })
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();


        //
        TextView messageView = (TextView) alertDialog.findViewById(android.R.id.message);
        messageView.setGravity(Gravity.CENTER);

        TextView titleView = (TextView) alertDialog.findViewById(context.getResources().getIdentifier("alertTitle", "id", "android"));
        if (titleView != null) {
            titleView.setGravity(Gravity.CENTER);
        }
    }

    //


    private void startAudio(int audioResId) {
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
            mMediaPlayer = null;
        }
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), audioResId);
        mMediaPlayer.start();
    }
}
