package org.legendtitans.wackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Game2 extends AppCompatActivity {
    TextView textView;
    TextView textViewScore2;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    int points2 = 1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        textView = findViewById(R.id.timerview2);
        textViewScore2 = findViewById(R.id.textView5);
        textViewScore2.setText(""+points2);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);

        imageView10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView10.setVisibility(View.INVISIBLE);

                return false;
            }
        });
        imageView11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView11.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView12.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView13.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView14.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView15.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView16.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        imageView17.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textViewScore2.setText(""+points2);
                points2 = points2 + 1;
                imageView17.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        ImageView[] Worms2 = {imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17};
        CountDownTimer WormJumps = new CountDownTimer(3000, 3000) {
            Random random = new Random();
            int randNum;
            public void onTick(long millisUntilFinished) {
                randNum = random.nextInt(8);
                Worms2[randNum].setVisibility(View.VISIBLE);
            }

            public void onFinish() {
                Worms2[randNum].setVisibility(View.INVISIBLE);
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
            }
        }.start();



    }
}

