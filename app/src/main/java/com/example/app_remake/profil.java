package com.example.app_remake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }

    public void back_two(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }

    public void click_sertif(View view) {
        Intent i = new Intent(this, sertif.class);
        startActivity(i);
    }
}
