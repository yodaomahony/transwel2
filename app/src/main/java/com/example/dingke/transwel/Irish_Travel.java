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

public class Irish_Travel extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.irish_travel);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton188 = (ImageButton) findViewById(R.id.imageButton188);

        imageButton188.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Travel.this,Irish_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton189 = (ImageButton) findViewById(R.id.imageButton189);

        imageButton189.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Travel.this,Irish_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton191 = (ImageButton) findViewById(R.id.imageButton191);

        imageButton191.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Travel.this,Irish_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton192 = (ImageButton) findViewById(R.id.imageButton192);

        imageButton192.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Travel.this,Irish_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton whereis = (ImageButton) findViewById(R.id.imageButton154);

        whereis.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Where is...?", "Cá bhfuil...？", R.raw.irish_26whereis);
                                       }
                                   }
        );

        ImageButton whentrain = (ImageButton) findViewById(R.id.imageButton155);

        whentrain.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("When does the train leave?", "Cén t-am a fhágáil ar an traein?", R.raw.irish_27whendoestrainleave);
                                         }
                                     }
        );

        ImageButton wheretrain = (ImageButton) findViewById(R.id.imageButton156);

        wheretrain.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("Where is the train station?", "Cá bhfuil an stáisiún traenach?", R.raw.irish_28wheretrainstation);
                                          }
                                      }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton157);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much...?", "Cé mhéad?", R.raw.irish_16howmuch);
                                       }
                                   }
        );

        ImageButton left = (ImageButton) findViewById(R.id.imageButton159);

        left.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("left", "clé", R.raw.irish_29left);
                                    }
                                }
        );

        ImageButton right = (ImageButton) findViewById(R.id.imageButton160);

        right.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("right", "deis", R.raw.irish_30right);
                                     }
                                 }
        );

        ImageButton near = (ImageButton) findViewById(R.id.imageButton161);

        near.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("Is it near?", "Tá sé in aice?", R.raw.irish_31isitnear);
                                    }
                                }
        );

        ImageButton taxi = (ImageButton) findViewById(R.id.imageButton162);

        taxi.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("taxi", "tacsaí", R.raw.irish_32taxi);
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
