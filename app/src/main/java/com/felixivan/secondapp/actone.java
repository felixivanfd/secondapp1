package com.felixivan.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class actone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actone);
    }

    public void callAct(View view){
        Intent intent = new Intent("com.felixivan.firstapp.ActivityTwo");
        startActivity(intent);
    }
}
