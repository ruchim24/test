package com.example.nameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Extra_Message");
        TextView textView = findViewById(R.id.button);
        textView.setText(message);

    }
}