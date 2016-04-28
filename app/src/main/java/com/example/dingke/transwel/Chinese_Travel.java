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

public class Chinese_Travel extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_travel);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton121 = (ImageButton) findViewById(R.id.imageButton121);

        imageButton121.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Travel.this,Chinese_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton122 = (ImageButton) findViewById(R.id.imageButton122);

        imageButton122.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Travel.this,Chinese_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton124 = (ImageButton) findViewById(R.id.imageButton124);

        imageButton124.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Travel.this,Chinese_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton125 = (ImageButton) findViewById(R.id.imageButton125);

        imageButton125.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Travel.this,Chinese_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );


        ImageButton whereis = (ImageButton) findViewById(R.id.imageButton87);

        whereis.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Where is...?", "...在哪里？", R.raw.chinese_26whereis);
                                       }
                                   }
        );

        ImageButton whentrain = (ImageButton) findViewById(R.id.imageButton88);

        whentrain.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("When does the train leave?", "火车几点发车？", R.raw.chinese_27whentrainleave);
                                        }
                                    }
        );

        ImageButton wheretrain = (ImageButton) findViewById(R.id.imageButton89);

        wheretrain.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("Where is the train station?", "火车站在哪儿？", R.raw.chinese_28wheretrainstation);
                                      }
                                  }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton90);

       howmuch.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("How much...?", "多少钱？", R.raw.chinese_16howmuch);
                                    }
                                }
        );

        ImageButton left = (ImageButton) findViewById(R.id.imageButton92);

        left.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("left", "左边", R.raw.chinese_29left);
                                      }
                                  }
        );

        ImageButton right = (ImageButton) findViewById(R.id.imageButton93);

        right.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("right", "右边", R.raw.chinese_30right);
                                    }
                                }
        );

        ImageButton near = (ImageButton) findViewById(R.id.imageButton94);

        near.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("Is it near?", "是不是很近？", R.raw.chinese_31isitnear);
                                    }
                                }
        );

        ImageButton taxi = (ImageButton) findViewById(R.id.imageButton95);

        taxi.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("taxi", "出租车", R.raw.chinese_32taxi);
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
