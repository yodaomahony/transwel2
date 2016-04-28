package com.example.dingke.transwel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLocalNewActivity = new Intent(Home.this,Hindi_Basic.class);
                startActivity(intentLocalNewActivity);


            }
        });


        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLocalNewActivity = new Intent(Home.this,Chinese_Basic.class);
                startActivity(intentLocalNewActivity);


            }
        });

        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLocalNewActivity = new Intent(Home.this,Irish_Basic.class);
                startActivity(intentLocalNewActivity);


            }
        });

        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLocalNewActivity = new Intent(Home.this,French_Basic.class);
                startActivity(intentLocalNewActivity);


            }
        });
    }
}
