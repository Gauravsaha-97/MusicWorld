package com.example.android.musicworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Justin Beaber", "Yummy", R.drawable.play));
        songs.add(new Songs("Drip Report", "Skechers", R.drawable.play));
        songs.add(new Songs("Drake", "Toosie Slide", R.drawable.play));
        songs.add(new Songs("Justin Beaber", "Intentions", R.drawable.play));
        songs.add(new Songs("Aarman Malik", "Control", R.drawable.play));
        songs.add(new Songs("Alan Walkar", "Heading Home", R.drawable.play));
        songs.add(new Songs("The Weekend", "Blinding Lights", R.drawable.play));
        songs.add(new Songs("Dua Lipa", "Don't Start Now", R.drawable.play));
        songs.add(new Songs("Selena Gomez", "Feel Me", R.drawable.play));
        songs.add(new Songs("Maroon5", "Memories", R.drawable.play));
        songs.add(new Songs("Justin Beaber", "Yummy", R.drawable.play));
        songs.add(new Songs("Drip Report", "Skechers", R.drawable.play));
        songs.add(new Songs("Drake", "Toosie Slide", R.drawable.play));
        songs.add(new Songs("Justin Beaber", "Intentions", R.drawable.play));
        songs.add(new Songs("Aarman Malik", "Control", R.drawable.play));
        songs.add(new Songs("Alan Walkar", "Heading Home", R.drawable.play));
        songs.add(new Songs("The Weekend", "Blinding Lights", R.drawable.play));
        songs.add(new Songs("Dua Lipa", "Don't Start Now", R.drawable.play));
        songs.add(new Songs("Selena Gomez", "Feel Me", R.drawable.play));
        songs.add(new Songs("Maroon5", "Memories", R.drawable.play));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

