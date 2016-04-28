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

public class Hindi_Numbers extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindi_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton66 = (ImageButton) findViewById(R.id.imageButton66);

        imageButton66.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Numbers.this,Hindi_Basic.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton67 = (ImageButton) findViewById(R.id.imageButton67);

        imageButton67.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Numbers.this,Hindi_Meals.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton68 = (ImageButton) findViewById(R.id.imageButton68);

        imageButton68.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Numbers.this,Hindi_Travel.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton69 = (ImageButton) findViewById(R.id.imageButton69);

        imageButton69.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Numbers.this,Hindi_Shopping.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );


        ImageButton one = (ImageButton) findViewById(R.id.imageButton41);

        one.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("one", "एक", R.raw.hindi_1);
                                   }
                               }
        );

        ImageButton two = (ImageButton) findViewById(R.id.imageButton42);

        two.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("two", "दो", R.raw.hindi_2);
                                   }
                               }
        );

        ImageButton three = (ImageButton) findViewById(R.id.imageButton43);

        three.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("three", "तीन", R.raw.hindi_3);
                                     }
                                 }
        );

        ImageButton four = (ImageButton) findViewById(R.id.imageButton44);

        four.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("four", "चार", R.raw.hindi_4);
                                    }
                                }
        );

        ImageButton five = (ImageButton) findViewById(R.id.imageButton45);

        five.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("five", "पंज", R.raw.hindi_5);
                                    }
                                }
        );

        ImageButton six = (ImageButton) findViewById(R.id.imageButton46);

        six.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("six", "छे", R.raw.hindi_6);
                                   }
                               }
        );

        ImageButton seven = (ImageButton) findViewById(R.id.imageButton47);

        seven.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("seven", "सात", R.raw.hindi_7);
                                     }
                                 }
        );

        ImageButton eight = (ImageButton) findViewById(R.id.imageButton48);

        eight.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("eight", "आठ", R.raw.hindi_8);
                                     }
                                 }
        );

        ImageButton nine = (ImageButton) findViewById(R.id.imageButton49);

        nine.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("nine", "नौ", R.raw.hindi_9);
                                    }
                                }
        );

        ImageButton ten = (ImageButton) findViewById(R.id.imageButton50);

        ten.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("ten", "दस", R.raw.hindi_10);
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
