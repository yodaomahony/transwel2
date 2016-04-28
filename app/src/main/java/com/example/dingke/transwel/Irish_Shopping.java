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

public class Irish_Shopping extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.irish_shopping);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton198 = (ImageButton) findViewById(R.id.imageButton198);

        imageButton198.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Shopping.this,Irish_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton199 = (ImageButton) findViewById(R.id.imageButton199);

        imageButton199.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Shopping.this,Irish_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton200 = (ImageButton) findViewById(R.id.imageButton200);

        imageButton200.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Shopping.this,Irish_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton202 = (ImageButton) findViewById(R.id.imageButton202);

        imageButton202.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Shopping.this,Irish_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );
        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton163);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much is...?", "Cé mhéad?", R.raw.irish_16howmuch);
                                       }
                                   }
        );


        ImageButton pharmacy = (ImageButton) findViewById(R.id.imageButton164);

        pharmacy.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Where is the pharmacy?", "Cá bhfuil an cógaslann??", R.raw.irish_22pharmacy);
                                        }
                                    }
        );

        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton165);

        idlike.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I would like...", "Ba mhaith liom...", R.raw.irish_17idlike);
                                      }
                                  }
        );

        ImageButton help = (ImageButton) findViewById(R.id.imageButton166);

        help.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("I need help", "Teastaíonn cúnamh uaim", R.raw.irish_23help);
                                    }
                                }
        );

        ImageButton change = (ImageButton) findViewById(R.id.imageButton167);

        change.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("Can I get change?", "An bhfuil sóinseáil agat?", R.raw.irish_24change);
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
