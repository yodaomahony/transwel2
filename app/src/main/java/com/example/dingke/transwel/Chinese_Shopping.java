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

public class Chinese_Shopping extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_shopping);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton126 = (ImageButton) findViewById(R.id.imageButton126);

        imageButton126.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Shopping.this,Chinese_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton127 = (ImageButton) findViewById(R.id.imageButton127);

        imageButton127.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Shopping.this,Chinese_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton128 = (ImageButton) findViewById(R.id.imageButton128);

        imageButton128.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Shopping.this,Chinese_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton130 = (ImageButton) findViewById(R.id.imageButton130);

        imageButton130.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Shopping.this,Chinese_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );
        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton96);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much is...?", "多少钱？", R.raw.chinese_16howmuch);
                                       }
                                   }
        );


        ImageButton pharmacy = (ImageButton) findViewById(R.id.imageButton97);

        pharmacy.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("Where is the pharmacy?", "哪里有药店", R.raw.chinese_22wherepharmacy);
                                      }
                                  }
        );

        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton98);

        idlike.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("I would like...", "我想要...", R.raw.chinese_17idlike);
                                          }
                                      }
        );

        ImageButton help = (ImageButton) findViewById(R.id.imageButton99);

        help.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("I need help", "我需要帮助", R.raw.chinese_23help);
                                       }
                                   }
        );

        ImageButton change = (ImageButton) findViewById(R.id.imageButton100);

        change.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Can I get change?", "能帮我换零钱吗？", R.raw.chinese_24change);
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
