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

public class French_Shopping extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.french_shopping);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton259 = (ImageButton) findViewById(R.id.imageButton259);

        imageButton259.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Shopping.this,French_Basic.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton260 = (ImageButton) findViewById(R.id.imageButton260);

        imageButton260.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Shopping.this,French_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton261 = (ImageButton) findViewById(R.id.imageButton261);

        imageButton261.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Shopping.this,French_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton263 = (ImageButton) findViewById(R.id.imageButton263);

        imageButton263.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Shopping.this,French_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton96);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much is...?", "Combien?", R.raw.french_16howmuch);
                                       }
                                   }
        );


        ImageButton pharmacy = (ImageButton) findViewById(R.id.imageButton97);

        pharmacy.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Where is the pharmacy?", "Où se trouve la pharmacie?", R.raw.french_22pharmacy);
                                        }
                                    }
        );

        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton98);

        idlike.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I would like...", "Je voudrais...", R.raw.french_17idlike);
                                      }
                                  }
        );

        ImageButton help = (ImageButton) findViewById(R.id.imageButton99);

        help.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("I need help", "J'ai besoin d'aide", R.raw.french_23help);
                                    }
                                }
        );

        ImageButton change = (ImageButton) findViewById(R.id.imageButton100);

        change.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("Can I get change?", "Puis-je obtenir la petite monnaie?", R.raw.french_24change);
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
