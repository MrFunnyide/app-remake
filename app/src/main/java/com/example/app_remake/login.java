package com.example.app_remake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }

    public void back_one(View view) {
        Intent i = new Intent(this, pilihNegara.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(this, profil.class);
        startActivity(i);
    }
}
