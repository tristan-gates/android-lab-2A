package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button RCK, PPR, SCSR;
    TextView Score, PlayWeapon, CompWeapon, WinMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RCK = (Button) findViewById(R.id.RCK);
        PPR = (Button) findViewById(R.id.PPR);
        SCSR = (Button) findViewById(R.id.SCSR);

        Score = (TextView) findViewById(R.id.Score);
        PlayWeapon = (TextView) findViewById(R.id.PlayWeapon);
        CompWeapon = (TextView) findViewById(R.id.CompWeapon);
        WinMessage = (TextView) findViewById(R.id.WinMessage);

        RCK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        PPR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        SCSR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}