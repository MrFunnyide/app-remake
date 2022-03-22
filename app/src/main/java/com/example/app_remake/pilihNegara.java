package com.example.app_remake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pilihNegara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_pilih_negara);
    }

    public void clickWargaIndo(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }

    public void clickNonIndo(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }
}
