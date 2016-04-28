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

public class Hindi_Travel extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindi_travel);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton56 = (ImageButton) findViewById(R.id.imageButton56);

        imageButton56.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Travel.this,Hindi_Basic.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton57 = (ImageButton) findViewById(R.id.imageButton57);

        imageButton57.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Travel.this,Hindi_Meals.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton59 = (ImageButton) findViewById(R.id.imageButton59);

        imageButton59.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Travel.this,Hindi_Shopping.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton60 = (ImageButton) findViewById(R.id.imageButton60);

        imageButton60.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Travel.this,Hindi_Numbers.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton whereis = (ImageButton) findViewById(R.id.imageButton27);

        whereis.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Where is...?", "कहाँ है ?", R.raw.h26whereisit_kahahain);
                                       }
                                   }
        );

        ImageButton whentrain = (ImageButton) findViewById(R.id.imageButton28);

        whentrain.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("When does the train leave?", "ट्रेन कितने बजे?", R.raw.h27whenisthetrain_trainkitnebaje);
                                         }
                                     }
        );

        ImageButton wheretrain = (ImageButton) findViewById(R.id.imageButton29);

        wheretrain.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("Where is the train station?", "रेलवे स्टेशन कहाँ है?", R.raw.h28whereistherailwaystation_railwaystationkahahain);
                                          }
                                      }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton30);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much...?", "कितना?", R.raw.h16howmuch_kitna);
                                       }
                                   }
        );

        ImageButton left = (ImageButton) findViewById(R.id.imageButton32);

        left.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("left", "बाएं", R.raw.h29left_baaye);
                                    }
                                }
        );

        ImageButton right = (ImageButton) findViewById(R.id.imageButton33);

        right.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("right", "दाएं", R.raw.h30right_daaye);
                                     }
                                 }
        );

        ImageButton near = (ImageButton) findViewById(R.id.imageButton34);

        near.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("Is it near?", "क्या यह पास में है?", R.raw.h31isitnear_kyayahapassmeinhain);
                                    }
                                }
        );

        ImageButton taxi = (ImageButton) findViewById(R.id.imageButton35);

        taxi.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("taxi", "टैक्सी", R.raw.h32taxi_taiksee);
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