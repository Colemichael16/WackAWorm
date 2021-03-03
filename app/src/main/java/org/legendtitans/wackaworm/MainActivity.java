package org.legendtitans.wackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewPlay = (ImageView) findViewById(R.id.playImageView);
        imageViewPlay.setOnTouchListener(new View.OnTouchListener() {
            @Override
                    public boolean onTouch(View v, MotionEvent event) {

                Toast.makeText(getApplicationContext(), "I was touched", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Game.class));
                return false;
            }
        });


    }
}












