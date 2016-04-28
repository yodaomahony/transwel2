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

public class Chinese_Basic extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_basic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageButton imageButton112 = (ImageButton) findViewById(R.id.imageButton112);

        imageButton112.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentLocalNewActivity = new Intent(Chinese_Basic.this,Chinese_Meals.class);
                                                startActivity(intentLocalNewActivity);
                                            }
                                        }
        );

        ImageButton imageButton113 = (ImageButton) findViewById(R.id.imageButton113);

        imageButton113.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentLocalNewActivity = new Intent(Chinese_Basic.this,Chinese_Travel.class);
                                                startActivity(intentLocalNewActivity);
                                            }
                                        }
        );

        ImageButton imageButton114 = (ImageButton) findViewById(R.id.imageButton114);

        imageButton114.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentLocalNewActivity = new Intent(Chinese_Basic.this,Chinese_Shopping.class);
                                                startActivity(intentLocalNewActivity);
                                            }
                                        }
        );

        ImageButton imageButton115 = (ImageButton) findViewById(R.id.imageButton115);

        imageButton115.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Chinese_Basic.this,Chinese_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );


        ImageButton hello = (ImageButton) findViewById(R.id.imageButton71);

        hello.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 translation("Hello", "你好", R.raw.chinese_3hello);
                                             }
                                         }
        );

        ImageButton goodbye = (ImageButton) findViewById(R.id.imageButton72);

        goodbye.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 translation("Goodbye", "再见", R.raw.chinese_4goodbye);
                                             }
                                         }
        );

        ImageButton thankyou = (ImageButton) findViewById(R.id.imageButton73);

        thankyou.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 translation("Thank You", "谢谢", R.raw.chinese_5thankyou);
                                             }
                                         }
        );

        ImageButton nothankyou = (ImageButton) findViewById(R.id.imageButton74);

        nothankyou.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 translation("No Thank You", "不！谢谢", R.raw.chinese_6nothankyou);
                                             }
                                         }
        );

        ImageButton howareyou = (ImageButton) findViewById(R.id.imageButton75);

        howareyou.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 translation("How are you?", "你好吗？", R.raw.chinese_7howareyou);
                                             }
                                         }
        );

        ImageButton myname = (ImageButton) findViewById(R.id.imageButton76);

        myname.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("My name is...", "我的名字是...", R.raw.chinese_13mynameis);
                                         }
                                     }
        );

        ImageButton bathroom = (ImageButton) findViewById(R.id.imageButton77);

        bathroom.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("Where is the bathroom?", "厕所在哪里？", R.raw.chinese_9bathroom);
                                         }
                                     }
        );

        ImageButton sorry = (ImageButton) findViewById(R.id.imageButton78);

        sorry.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("Sorry", "对不起", R.raw.chinese_10sorry);
                                         }
                                     }
        );

        ImageButton english = (ImageButton) findViewById(R.id.imageButton79);

        english.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("Do you speak English?", "你会说英语吗？", R.raw.chinese_11speakenglish);
                                         }
                                     }
        );

        ImageButton imfrom = (ImageButton) findViewById(R.id.imageButton80);

        imfrom.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("I'm from", "我来自...", R.raw.chinese_12imfrom);
                                         }
                                     }
        );

        ImageButton yes = (ImageButton) findViewById(R.id.imageButton81);

        yes.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("Yes", "是的", R.raw.chinese_14yes);
                                         }
                                     }
        );

        ImageButton imfine = (ImageButton) findViewById(R.id.imageButton148);

        imfine.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("I'm fine", "我很好", R.raw.chinese_8imfine);
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
