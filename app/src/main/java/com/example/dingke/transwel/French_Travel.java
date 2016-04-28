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

public class French_Travel extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.french_travel);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton254 = (ImageButton) findViewById(R.id.imageButton254);

        imageButton254.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Travel.this,French_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton255 = (ImageButton) findViewById(R.id.imageButton255);

        imageButton255.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Travel.this,French_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton257 = (ImageButton) findViewById(R.id.imageButton257);

        imageButton257.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Travel.this,French_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton258 = (ImageButton) findViewById(R.id.imageButton258);

        imageButton258.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Travel.this,French_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );


        ImageButton whereis = (ImageButton) findViewById(R.id.imageButton87);

        whereis.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Where is...?", "Où se trouve...?？", R.raw.french_26whereis);
                                       }
                                   }
        );

        ImageButton whentrain = (ImageButton) findViewById(R.id.imageButton88);

        whentrain.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("When does the train leave?", "Quand part le train?", R.raw.french_27whentrainleave);
                                         }
                                     }
        );

        ImageButton wheretrain = (ImageButton) findViewById(R.id.imageButton89);

        wheretrain.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("Where is the train station?", "Où se trouve la gare?", R.raw.french_28wheretrainstation);
                                          }
                                      }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton90);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much...?", "Combien?", R.raw.french_16howmuch);
                                       }
                                   }
        );

        ImageButton left = (ImageButton) findViewById(R.id.imageButton92);

        left.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("left", "gauche", R.raw.french_29left);
                                    }
                                }
        );

        ImageButton right = (ImageButton) findViewById(R.id.imageButton93);

        right.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("right", "droite", R.raw.french_30right);
                                     }
                                 }
        );

        ImageButton near = (ImageButton) findViewById(R.id.imageButton94);

        near.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("Is it near?", "Est-il près?", R.raw.french_31isitnear);
                                    }
                                }
        );

        ImageButton taxi = (ImageButton) findViewById(R.id.imageButton95);

        taxi.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("taxi", "taxi", R.raw.french_32taxi);
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
