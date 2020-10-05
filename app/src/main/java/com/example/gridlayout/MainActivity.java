package com.example.gridlayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.view.WindowManager;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    Button buttonRed;
    Button buttonBlue;
    Button buttonGreen;
    Button buttonYellow;
    Button buttonMagenta;
    Button buttonWhite;
    ConstraintLayout background;
    boolean iscolor = true;
    ImageView bird1;
    ImageView bird2;
    ImageView bird3;
    ImageView bird4;
    ImageView bird5;
    ImageView bird6;
    ImageView bird7;
    ImageView bird8;
    ImageView bird9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = findViewById(R.id.buttonRed);
        buttonBlue = findViewById(R.id.buttonBlue);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonYellow = findViewById(R.id.buttonYellow);
        buttonMagenta = findViewById(R.id.buttonMagenta);
        buttonWhite = findViewById(R.id.buttonWhite);
        final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.background1);

        bird1 = findViewById(R.id.bird1);
        bird2 = findViewById(R.id.bird2);
        bird3 = findViewById(R.id.bird3);
        bird4 = findViewById(R.id.bird4);
        bird5 = findViewById(R.id.bird5);
        bird6 = findViewById(R.id.bird6);
        bird7 = findViewById(R.id.bird7);
        bird8 = findViewById(R.id.bird8);
        bird9 = findViewById(R.id.bird9);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iscolor){
                    layout.setBackgroundColor(Color.RED);
                }
                else{
                    layout.setBackgroundColor(Color.WHITE);
                }
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iscolor){
                    layout.setBackgroundColor(Color.BLUE);
                }
                else{
                    layout.setBackgroundColor(Color.WHITE);
                }
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iscolor){
                    layout.setBackgroundColor(Color.GREEN);
                }
                else{
                    layout.setBackgroundColor(Color.WHITE);
                }
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iscolor){
                    layout.setBackgroundColor(Color.YELLOW);
                }
                else{
                    layout.setBackgroundColor(Color.WHITE);
                }
            }
        });

        buttonMagenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iscolor){
                    layout.setBackgroundColor(Color.MAGENTA);
                }
                else{
                    layout.setBackgroundColor(Color.WHITE);
                }
            }
        });

        buttonWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iscolor){
                    layout.setBackgroundColor(Color.WHITE);
                }
                else{
                    layout.setBackgroundColor(Color.WHITE);
                }
            }
        });

        bird1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity1.class);
                startActivity(intent);

            }
        });

        bird2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity2.class);
                startActivity(intent);
            }
        });

        bird3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity3.class);
                startActivity(intent);
            }
        });

        bird4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity4.class);
                startActivity(intent);
            }
        });

        bird5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity5.class);
                startActivity(intent);
            }
        });

        bird6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity6.class);
                startActivity(intent);
            }
        });

        bird7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity7.class);
                startActivity(intent);
            }
        });

        bird8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity8.class);
                startActivity(intent);
            }
        });

        bird9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FullActivity9.class);
                startActivity(intent);
            }
        });



    }
}
