package com.example.algorithmproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = findViewById((R.id.start_btn));
        Button howtoBtn = findViewById(R.id.howto_btn);


        Intent moveToSingle=new Intent(this,MainMenuActivity.class);

        startBtn.setOnClickListener(v->startActivity(moveToSingle));
    }
}