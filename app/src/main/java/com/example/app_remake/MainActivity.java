package com.example.app_remake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {
    private int waktu_load = 1500;

    //1000=1.5 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // setelah loading akan pindah ke
                Intent i = new Intent(MainActivity.this, pilihNegara.class);
                startActivity(i);
                finish();
            }
        },waktu_load);

    }
}