package com.example.nameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_Tag = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void secondactivity(View view) {
Log.d(LOG_Tag,"button cliked");
        Intent intent = new Intent(this,secondactivity.class);
        startActivity(intent);
        EditText editText = findViewById(R.id.mssg);
        String message = editText.getText().toString();
        intent.putExtra(Extra_Message,message);
    }
}