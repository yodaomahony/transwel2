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

public class French_Numbers extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.french_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton264 = (ImageButton) findViewById(R.id.imageButton264);

        imageButton264.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Numbers.this,French_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton265 = (ImageButton) findViewById(R.id.imageButton265);

        imageButton265.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Numbers.this,French_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton266 = (ImageButton) findViewById(R.id.imageButton266);

        imageButton266.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Numbers.this,French_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton267 = (ImageButton) findViewById(R.id.imageButton267);

        imageButton267.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Numbers.this,French_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );


        ImageButton one = (ImageButton) findViewById(R.id.imageButton234);

        one.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("one", "un", R.raw.french__1);
                                   }
                               }
        );

        ImageButton two = (ImageButton) findViewById(R.id.imageButton235);

        two.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("two", "deux", R.raw.french__2);
                                   }
                               }
        );

        ImageButton three = (ImageButton) findViewById(R.id.imageButton236);

        three.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("three", "trois", R.raw.french__3);
                                     }
                                 }
        );

        ImageButton four = (ImageButton) findViewById(R.id.imageButton237);

        four.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("four", "quatre", R.raw.french__4);
                                    }
                                }
        );

        ImageButton five = (ImageButton) findViewById(R.id.imageButton238);

        five.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("five", "cinq", R.raw.french__5);
                                    }
                                }
        );

        ImageButton six = (ImageButton) findViewById(R.id.imageButton239);

        six.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("six", "six", R.raw.french__6);
                                   }
                               }
        );

        ImageButton seven = (ImageButton) findViewById(R.id.imageButton240);

        seven.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("seven", "sept", R.raw.french__7);
                                     }
                                 }
        );

        ImageButton eight = (ImageButton) findViewById(R.id.imageButton241);

        eight.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("eight", "huit", R.raw.french__8);
                                     }
                                 }
        );

        ImageButton nine = (ImageButton) findViewById(R.id.imageButton242);

        nine.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("nine", "neuf", R.raw.french__9);
                                    }
                                }
        );

        ImageButton ten = (ImageButton) findViewById(R.id.imageButton243);

        ten.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("ten", "dix", R.raw.french__10);
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
