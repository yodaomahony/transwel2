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

public class Irish_Numbers extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.irish_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton193 = (ImageButton) findViewById(R.id.imageButton193);

        imageButton193.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Numbers.this,Irish_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton194 = (ImageButton) findViewById(R.id.imageButton194);

        imageButton194.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Numbers.this,Irish_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton195 = (ImageButton) findViewById(R.id.imageButton195);

        imageButton195.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Numbers.this,Irish_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton196 = (ImageButton) findViewById(R.id.imageButton196);

        imageButton196.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Numbers.this,Irish_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );


        ImageButton one = (ImageButton) findViewById(R.id.imageButton168);

        one.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("one", "a haon", R.raw.irish__1);
                                   }
                               }
        );

        ImageButton two = (ImageButton) findViewById(R.id.imageButton169);

        two.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("two", "a dó ", R.raw.irish__2);
                                   }
                               }
        );

        ImageButton three = (ImageButton) findViewById(R.id.imageButton170);

        three.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("three", "a trí", R.raw.irish__3);
                                     }
                                 }
        );

        ImageButton four = (ImageButton) findViewById(R.id.imageButton171);

        four.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("four", "a ceathair", R.raw.irish__4);
                                    }
                                }
        );

        ImageButton five = (ImageButton) findViewById(R.id.imageButton172);

        five.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("five", "a cúig", R.raw.irish__5);
                                    }
                                }
        );

        ImageButton six = (ImageButton) findViewById(R.id.imageButton173);

        six.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("six", "a sé", R.raw.irish__6);
                                   }
                               }
        );

        ImageButton seven = (ImageButton) findViewById(R.id.imageButton174);

        seven.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("seven", "a seacht", R.raw.irish__7);
                                     }
                                 }
        );

        ImageButton eight = (ImageButton) findViewById(R.id.imageButton175);

        eight.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("eight", "a hocht", R.raw.irish__8);
                                     }
                                 }
        );

        ImageButton nine = (ImageButton) findViewById(R.id.imageButton176);

        nine.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("nine", "a naoi", R.raw.irish__9);
                                    }
                                }
        );

        ImageButton ten = (ImageButton) findViewById(R.id.imageButton177);

        ten.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("ten", "a deich", R.raw.irish__10);
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
