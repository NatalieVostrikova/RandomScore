package com.example.randomscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void getRandomValue(View view){

        TextView textView = findViewById(R.id.textView2);
        int newValue;
        newValue = (int) (Math.random()*5+1);
        textView.setText(newValue);

}

}