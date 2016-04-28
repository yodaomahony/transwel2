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

public class French_Meals extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.french_meals);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton249 = (ImageButton) findViewById(R.id.imageButton249);

        imageButton249.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Meals.this,French_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton251 = (ImageButton) findViewById(R.id.imageButton251);

        imageButton251.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Meals.this,French_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton252 = (ImageButton) findViewById(R.id.imageButton252);

        imageButton252.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Meals.this,French_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton253 = (ImageButton) findViewById(R.id.imageButton253);

        imageButton253.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Meals.this,French_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );


        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton215);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much is...?", "Combien?", R.raw.french_16howmuch);
                                       }
                                   }
        );


        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton216);

        idlike.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I would like...", "Je voudrais...", R.raw.french_17idlike);
                                      }
                                  }
        );

        ImageButton vegetarian = (ImageButton) findViewById(R.id.imageButton217);

        vegetarian.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("I am vegetarian", "Je suis végétarien", R.raw.french_18vegetarian);
                                          }
                                      }
        );

        ImageButton allergy = (ImageButton) findViewById(R.id.imageButton218);

        allergy.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("I have allergies", "Je suis allergique", R.raw.french_19allergic);
                                       }
                                   }
        );

        ImageButton water = (ImageButton) findViewById(R.id.imageButton219);

        water.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Can I have a glass of water?", "Puis-je avoir un verre d'eau?", R.raw.french_20glasswater);
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
