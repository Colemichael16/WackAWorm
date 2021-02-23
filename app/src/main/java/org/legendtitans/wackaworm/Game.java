package org.legendtitans.wackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;

public class Game extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        textView = findViewById(R.id.timerview);

        new CountDownTimer(50000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = millisUntilFinished / 1000) ;
                textView.setText(sec+"");
            }
            public void onFinish() {
                textView.setText("0");

            }
        }.start();
    }

}