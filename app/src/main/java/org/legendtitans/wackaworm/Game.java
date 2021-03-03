package org.legendtitans.wackaworm;


import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
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
    int points = 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        textView = findViewById(R.id.timerview);
        textViewScore = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                points = points + 1;
                textViewScore.setText(points);

                return false;
            }
        });
        imageView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                points = points + 1;
                textViewScore.setText(points);
                return false;
            }
        });
        imageView3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                points = points + 1;
                textViewScore.setText(points);
                return false;
            }
        });
        imageView4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                points = points + 1;
                textViewScore.setText(points);
                return false;
            }
        });
        imageView5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(points);
                points = points + 1;
                return false;
            }
        });
        imageView6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(points);
                points = points + 1;
                return false;
            }
        });
        imageView7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(points);
                points = points + 1;
                return false;
            }
        });
        imageView8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore.setText(points);
                points = points + 1;
                return false;
            }
        });

        ImageView[] Worms = {imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8};
        new CountDownTimer(50000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = millisUntilFinished / 1000;
                textView.setText(sec + "");
            }

            public void onFinish() {
                textView.setText("0");
                System.exit(0);

            }
        }.start();

        new CountDownTimer(3000, 3000) {
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

    }
}

