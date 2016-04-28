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

public class Irish_Basic extends AppCompatActivity {

    final Context context = this;
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.irish_basic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton imageButton179 = (ImageButton) findViewById(R.id.imageButton179);

        imageButton179.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Basic.this,Irish_Meals.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton180 = (ImageButton) findViewById(R.id.imageButton180);

        imageButton180.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Basic.this,Irish_Travel.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton181 = (ImageButton) findViewById(R.id.imageButton181);

        imageButton181.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Basic.this,Irish_Shopping.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton imageButton182 = (ImageButton) findViewById(R.id.imageButton182);

        imageButton182.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent intentLocalNewActivity = new Intent(Irish_Basic.this,Irish_Numbers.class);
                                                  startActivity(intentLocalNewActivity);
                                              }
                                          }
        );

        ImageButton hello = (ImageButton) findViewById(R.id.imageButton136);

        hello.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Hello", "Dia Dhuit", R.raw.irish_3hello);
                                     }
                                 }
        );

        ImageButton goodbye = (ImageButton) findViewById(R.id.imageButton137);

        goodbye.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Goodbye", "Slán", R.raw.irish_4goodbye);
                                       }
                                   }
        );

        ImageButton thankyou = (ImageButton) findViewById(R.id.imageButton138);

        thankyou.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Thank You", "Go raibh maith agat", R.raw.irish_5thankyou);
                                        }
                                    }
        );

        ImageButton nothankyou = (ImageButton) findViewById(R.id.imageButton139);

        nothankyou.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              translation("No Thank You", "Go raibh maith agat, ach tá mé i gceart", R.raw.irish_6nothanks);
                                          }
                                      }
        );

        ImageButton howareyou = (ImageButton) findViewById(R.id.imageButton140);

        howareyou.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             translation("How are you?", "Conás atá tú?", R.raw.irish_7howareyou);
                                         }
                                     }
        );

        ImageButton myname = (ImageButton) findViewById(R.id.imageButton141);

        myname.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("My name is...", "...is ainm dom", R.raw.irish_13nameis);
                                      }
                                  }
        );

        ImageButton bathroom = (ImageButton) findViewById(R.id.imageButton142);

        bathroom.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            translation("Where is the bathroom?", "Cá bhfuil an leithreas?", R.raw.irish_9bathroom);
                                        }
                                    }
        );

        ImageButton sorry = (ImageButton) findViewById(R.id.imageButton143);

        sorry.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         translation("Sorry", "Tá brón orm", R.raw.irish_10sorry);
                                     }
                                 }
        );

        ImageButton english = (ImageButton) findViewById(R.id.imageButton144);

        english.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           translation("Do you speak English?", "An bhfuil Béarla agat?", R.raw.irish_11speakenglish);
                                       }
                                   }
        );

        ImageButton imfrom = (ImageButton) findViewById(R.id.imageButton145);

        imfrom.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I'm from", "Tá mé ó...", R.raw.irish_12imfrom);
                                      }
                                  }
        );

        ImageButton yes = (ImageButton) findViewById(R.id.imageButton146);

        yes.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       translation("Yes", "Tá", R.raw.irish_14yes);
                                   }
                               }
        );

        ImageButton imfine = (ImageButton) findViewById(R.id.imageButton147);

        imfine.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          translation("I'm fine", "Tá mé go breá", R.raw.irish_8imfine);
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
