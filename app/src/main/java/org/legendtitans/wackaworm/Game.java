package org.legendtitans.wackaworm;


import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    TextView textView;
    TextView textViewScore;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    Button TONEXTLEVEL;
    int points = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TONEXTLEVEL = findViewById(R.id.TONEXTLEVEL);
        textView = findViewById(R.id.timerview);
        textViewScore = findViewById(R.id.textView);
        textViewScore.setText(""+points);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView8);
        imageView3 = findViewById(R.id.imageView2);
        imageView4 = findViewById(R.id.imageView3);
        imageView5 = findViewById(R.id.imageView4);
        imageView6 = findViewById(R.id.imageView5);
        imageView7 = findViewById(R.id.imageView6);
        imageView8 = findViewById(R.id.imageView7);

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView.setVisibility(View.INVISIBLE);

                return false;
            }
        });
        imageView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView2.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView3.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView4.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView5.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView6.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView7.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(""+points);
                points = points + 1;
                imageView8.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        ImageView[] Worms = {imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8};
        CountDownTimer WormJumps = new CountDownTimer(3000, 3000) {
            Random random = new Random();
            int randNum;
            public void onTick(long millisUntilFinished) {
                randNum = random.nextInt(8);
                Worms[randNum].setVisibility(View.VISIBLE);
            }

            public void onFinish() {
                Worms[randNum].setVisibility(View.INVISIBLE);
                start();
            }
        }.start();


        new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = millisUntilFinished / 1000;
                textView.setText(sec + "");
            }

            public void onFinish() {
                WormJumps.cancel();
                textView.setText("0");
                TONEXTLEVEL.setVisibility(View.VISIBLE);
            }
        }.start();



    }
    public void ToNextLevel (View v) {
        startActivity(new Intent(getApplicationContext(), Game2.class));
    }
}

