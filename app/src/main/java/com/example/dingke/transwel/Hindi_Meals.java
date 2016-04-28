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

public class Hindi_Meals extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindi_meals);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton51 = (ImageButton) findViewById(R.id.imageButton51);

        imageButton51.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentLocalNewActivity = new Intent(Hindi_Meals.this,Hindi_Basic.class);
                                                startActivity(intentLocalNewActivity);
                                            }
                                        }
        );

        ImageButton imageButton53 = (ImageButton) findViewById(R.id.imageButton53);

        imageButton53.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Meals.this,Hindi_Travel.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton54 = (ImageButton) findViewById(R.id.imageButton54);

        imageButton54.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Meals.this,Hindi_Shopping.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton55 = (ImageButton) findViewById(R.id.imageButton55);

        imageButton55.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Meals.this,Hindi_Numbers.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton22);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much is...?", "कितना?", R.raw.h16howmuch_kitna);
                                       }
                                   }
        );


        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton23);

        idlike.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I would like...", "मैं_____पसंद करूँगा..", R.raw.h17iwouldlike_mainpasandkarunga);
                                      }
                                  }
        );

        ImageButton vegetarian = (ImageButton) findViewById(R.id.imageButton24);

        vegetarian.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("I am vegetarian", "मैं एक शाकाहारी हूं", R.raw.h18iamavegetarian_mainekshakaharihu);
                                          }
                                      }
        );

        ImageButton allergy = (ImageButton) findViewById(R.id.imageButton25);

        allergy.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("I have allergies", "मुझे एलर्जी है", R.raw.h19ihaveallergy_muzheallergyhain);
                                       }
                                   }
        );

        ImageButton water = (ImageButton) findViewById(R.id.imageButton26);

        water.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Can I have a glass of water?", "क्या मुझे एक गिलास पानी मिल सकता है", R.raw.h20canigetaglassofwater_kyamuzheekgilaaspanimilsaktahain);
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



