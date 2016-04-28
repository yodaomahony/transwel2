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

public class Hindi_Shopping extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindi_shopping);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton61 = (ImageButton) findViewById(R.id.imageButton61);

        imageButton61.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Shopping.this,Hindi_Basic.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton62 = (ImageButton) findViewById(R.id.imageButton62);

        imageButton62.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Shopping.this,Hindi_Meals.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton63 = (ImageButton) findViewById(R.id.imageButton63);

        imageButton63.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Shopping.this,Hindi_Travel.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton imageButton65 = (ImageButton) findViewById(R.id.imageButton65);

        imageButton65.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intentLocalNewActivity = new Intent(Hindi_Shopping.this,Hindi_Numbers.class);
                                                 startActivity(intentLocalNewActivity);
                                             }
                                         }
        );

        ImageButton howmuch = (ImageButton) findViewById(R.id.imageButton36);

        howmuch.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("How much is...?", "कितना?", R.raw.h16howmuch_kitna);
                                       }
                                   }
        );


        ImageButton pharmacy = (ImageButton) findViewById(R.id.imageButton37);

        pharmacy.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Where is the pharmacy?", "फार्मेसी कहाँ है?", R.raw.h22whereisthepharmacy_pharmacykahahain);
                                        }
                                    }
        );

        ImageButton idlike = (ImageButton) findViewById(R.id.imageButton38);

        idlike.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I would like...", "मैं_____पसंद करूँगा..", R.raw.h17iwouldlike_mainpasandkarunga);
                                      }
                                  }
        );

        ImageButton help = (ImageButton) findViewById(R.id.imageButton39);

        help.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        translation("I need help", "मुझे मदद की ज़रूरत है", R.raw.h23ineedhelp_muzhemadadkijarurathain);
                                    }
                                }
        );

        ImageButton change = (ImageButton) findViewById(R.id.imageButton40);

        change.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("Can I get change?", "क्या मुझे छुट्टा मिल सकता है?", R.raw.h24canigetchange_kyamuzhechuttamilsaktahain);
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
