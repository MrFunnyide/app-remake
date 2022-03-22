package com.example.app_remake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class sertif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_infovaksin);
    }

    public void back_three(View view) {
        Intent i = new Intent(this, profil.class);
        startActivity(i);
    }
}
