package com.alexy.soutenanceorale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sommaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_sommaire);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Sommaire.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
