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

public class Hindi_Basic extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindi_basic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLocalNewActivity = new Intent(Hindi_Basic.this,Hindi_Meals.class);
                startActivity(intentLocalNewActivity);
            }
        }
        );


        ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);

        imageButton7.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentLocalNewActivity = new Intent(Hindi_Basic.this,Hindi_Travel.class);
                                                startActivity(intentLocalNewActivity);
                                            }
                                        }
        );

        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

        imageButton8.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentLocalNewActivity = new Intent(Hindi_Basic.this,Hindi_Shopping.class);
                                                startActivity(intentLocalNewActivity);
                                            }
                                        }
        );

        ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);

        imageButton9.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentLocalNewActivity = new Intent(Hindi_Basic.this,Hindi_Numbers.class);
                                                startActivity(intentLocalNewActivity);
                                            }
                                        }
        );

        ImageButton hello = (ImageButton) findViewById(R.id.imageButton10);

        hello.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Hello", "नमस्ते", R.raw.h3hello_namaste);
                                     }
                                 }
        );

        ImageButton goodbye = (ImageButton) findViewById(R.id.imageButton11);

        goodbye.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Goodbye", "अलविदा", R.raw.h4goodbye_alvida);
                                       }
                                   }
        );

        ImageButton thankyou = (ImageButton) findViewById(R.id.imageButton12);

        thankyou.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Thank You", "धन्यवाद", R.raw.h5thankyou_dhanywaad);
                                        }
                                    }
        );

        ImageButton nothankyou = (ImageButton) findViewById(R.id.imageButton13);

        nothankyou.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("No Thank You", "नहीं धन्यवाद", R.raw.h6nothankyou_nahidhanyawaad);
                                          }
                                      }
        );

        ImageButton howareyou = (ImageButton) findViewById(R.id.imageButton14);

        howareyou.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("How are you?", "क्या हाल है?", R.raw.h7howareyou_kyahaalhai);
                                         }
                                     }
        );

        ImageButton myname = (ImageButton) findViewById(R.id.imageButton15);

        myname.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("My name is...", "मेरा नाम है...", R.raw.h13mynameis_meranaamhain);
                                      }
                                  }
        );

        ImageButton bathroom = (ImageButton) findViewById(R.id.imageButton16);

        bathroom.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Where is the bathroom?", "厕所在哪里？", R.raw.h9whereisthebathroom_bathroomkahahain);
                                        }
                                    }
        );

        ImageButton sorry = (ImageButton) findViewById(R.id.imageButton17);

        sorry.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Sorry", "बाथरूम कहां है?", R.raw.h10sorry_maafkijiye);
                                     }
                                 }
        );

        ImageButton english = (ImageButton) findViewById(R.id.imageButton18);

        english.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Do you speak English?", "क्या आप अंग्रेज़ी बोलते हैं", R.raw.h11doyouspeak_english_kyaappangreziboltehain);
                                       }
                                   }
        );

        ImageButton imfrom = (ImageButton) findViewById(R.id.imageButton19);

        imfrom.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I'm from", "मैं यहां से आया हूं...", R.raw.h12iamfrom_mainyahaseaayahu);
                                      }
                                  }
        );

        ImageButton yes = (ImageButton) findViewById(R.id.imageButton20);

        yes.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("Yes", "हाँ", R.raw.h14yes_haan);
                                   }
                               }
        );

        ImageButton imfine = (ImageButton) findViewById(R.id.imageButton21);

        imfine.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I'm fine", "मैं ठीक हूँ", R.raw.h8iamfine_maintheekhu);
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
