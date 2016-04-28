package com.example.dingke.transwel;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.media.MediaPlayer;


public class Chinese_Numbers extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton131 = (ImageButton) findViewById(R.id.imageButton131);

        imageButton131.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Numbers.this,Chinese_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton132 = (ImageButton) findViewById(R.id.imageButton132);

        imageButton132.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Numbers.this,Chinese_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton133 = (ImageButton) findViewById(R.id.imageButton133);

        imageButton133.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Numbers.this,Chinese_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton134 = (ImageButton) findViewById(R.id.imageButton134);

        imageButton134.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Numbers.this,Chinese_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton one = (ImageButton) findViewById(R.id.imageButton101);

        one.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("one", "一", R.raw.chinese_1);
                                    }
                                }
        );

        ImageButton two = (ImageButton) findViewById(R.id.imageButton102);

        two.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("two", "二", R.raw.chinese__2);
                                    }
                                }
        );

        ImageButton three = (ImageButton) findViewById(R.id.imageButton103);

        three.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("three", "三", R.raw.chinese__3);
                                   }
                               }
        );

        ImageButton four = (ImageButton) findViewById(R.id.imageButton104);

        four.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("four", "四", R.raw.chinese__4);
                                   }
                               }
        );

        ImageButton five = (ImageButton) findViewById(R.id.imageButton105);

        five.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("five", "五", R.raw.chinese__5);
                                   }
                               }
        );

        ImageButton six = (ImageButton) findViewById(R.id.imageButton106);

        six.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("six", "六", R.raw.chinese__6);
                                   }
                               }
        );

        ImageButton seven = (ImageButton) findViewById(R.id.imageButton107);

        seven.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("seven", "七", R.raw.chinese__7);
                                   }
                               }
        );

        ImageButton eight = (ImageButton) findViewById(R.id.imageButton108);

        eight.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("eight", "八", R.raw.chinese__8);
                                   }
                               }
        );

        ImageButton nine = (ImageButton) findViewById(R.id.imageButton109);

        nine.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("nine", "九", R.raw.chinese__9);
                                   }
                               }
        );

        ImageButton ten = (ImageButton) findViewById(R.id.imageButton110);

        ten.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("ten", "十", R.raw.chinese__10);
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
