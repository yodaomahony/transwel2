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

public class French_Basic extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.french_basic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton245 = (ImageButton) findViewById(R.id.imageButton245);

        imageButton245.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Basic.this,French_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton246 = (ImageButton) findViewById(R.id.imageButton246);

        imageButton246.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Basic.this,French_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton247 = (ImageButton) findViewById(R.id.imageButton247);

        imageButton247.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Basic.this,French_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton248 = (ImageButton) findViewById(R.id.imageButton248);

        imageButton248.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(French_Basic.this,French_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );
        ImageButton hello = (ImageButton) findViewById(R.id.imageButton203);

        hello.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Hello", "Salut", R.raw.french_3hello);
                                     }
                                 }
        );

        ImageButton goodbye = (ImageButton) findViewById(R.id.imageButton204);

        goodbye.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Goodbye", "Au Revoir", R.raw.french_4goodbye);
                                       }
                                   }
        );

        ImageButton thankyou = (ImageButton) findViewById(R.id.imageButton205);

        thankyou.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Thank You", "Merci", R.raw.french_5thanks);
                                        }
                                    }
        );

        ImageButton nothankyou = (ImageButton) findViewById(R.id.imageButton206);

        nothankyou.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("No Thank You", "Merci non", R.raw.french_6nothanks);
                                          }
                                      }
        );

        ImageButton howareyou = (ImageButton) findViewById(R.id.imageButton207);

        howareyou.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("How are you?", "Ca va?", R.raw.french_7howareyou);
                                         }
                                     }
        );

        ImageButton myname = (ImageButton) findViewById(R.id.imageButton208);

        myname.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("My name is...", "Je m'appelle...", R.raw.french_13mynameis);
                                      }
                                  }
        );

        ImageButton bathroom = (ImageButton) findViewById(R.id.imageButton209);

        bathroom.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Where is the bathroom?", "Où se trouvent les toilettes?", R.raw.french_9bathroom);
                                        }
                                    }
        );

        ImageButton sorry = (ImageButton) findViewById(R.id.imageButton210);

        sorry.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Sorry", "Pardon", R.raw.french_10sorry);
                                     }
                                 }
        );

        ImageButton english = (ImageButton) findViewById(R.id.imageButton211);

        english.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Do you speak English?", "Parlez-vous Anglais?", R.raw.french_11speakenglish);
                                       }
                                   }
        );

        ImageButton imfrom = (ImageButton) findViewById(R.id.imageButton212);

        imfrom.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I'm from", "Je viens de...", R.raw.french_12imfrom);
                                      }
                                  }
        );

        ImageButton yes = (ImageButton) findViewById(R.id.imageButton213);

        yes.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("Yes", "Oui", R.raw.french_14yes);
                                   }
                               }
        );

        ImageButton imfine = (ImageButton) findViewById(R.id.imageButton214);

        imfine.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I'm fine", "Ca va bien", R.raw.french_8imfine);
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
