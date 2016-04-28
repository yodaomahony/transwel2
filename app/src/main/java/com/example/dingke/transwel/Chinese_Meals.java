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

public class Chinese_Meals extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_meals);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton116 = (ImageButton) findViewById(R.id.imageButton116);

        imageButton116.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Meals.this, Chinese_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton118 = (ImageButton) findViewById(R.id.imageButton118);

        imageButton118.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Meals.this, Chinese_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton119 = (ImageButton) findViewById(R.id.imageButton119);

        imageButton119.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Meals.this, Chinese_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton120 = (ImageButton) findViewById(R.id.imageButton120);

        imageButton120.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Meals.this, Chinese_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton82);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 translation("How much is...?", "多少钱？", R.raw.chinese_16howmuch);
                                             }
                                         }
        );


        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton83);

        idlike.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 translation("I would like...", "我想要...", R.raw.chinese_17idlike);
                                             }
                                         }
        );

        ImageButton vegetarian = (ImageButton) findViewById(R.id.imageButton84);

        vegetarian.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I am vegetarian", "我是个素食主义者", R.raw.chinese_18vegetarian);
                                      }
                                  }
        );

        ImageButton allergy = (ImageButton) findViewById(R.id.imageButton85);

        allergy.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I have allergies", "我有过敏症", R.raw.chinese_19allergies);
                                      }
                                  }
        );

        ImageButton water = (ImageButton) findViewById(R.id.imageButton86);

        water.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("Can I have a glass of water?", "能给我一杯水吗？", R.raw.chinese_20glasswater);
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

