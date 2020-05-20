package com.example.android.musicworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hindi = (Button) findViewById(R.id.hindi);
        hindi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, HindiActivity.class);
                startActivity(i);
            }

        });
        Button english = (Button) findViewById(R.id.english);
        english.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, EnglishActivity.class);
                startActivity(i);
            }

        });
    }
}
