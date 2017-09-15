package com.alexy.soutenanceorale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);
    }

    public void goSommaire(View v){
        Intent intent = new Intent(MainActivity.this, Sommaire.class);
        startActivity(intent);
    }
}
