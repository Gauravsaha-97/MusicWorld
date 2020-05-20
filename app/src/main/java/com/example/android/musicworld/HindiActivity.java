package com.example.android.musicworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Arijit Singh", "Dil Sambhaal Zara", R.drawable.play));
        songs.add(new Songs("Atif Aslam", "Dekhte Dekhte", R.drawable.play));
        songs.add(new Songs("Neeraj Shridhar", "Twist", R.drawable.play));
        songs.add(new Songs("Shankar Mahadevan", "Desi Girl", R.drawable.play));
        songs.add(new Songs("Mika Singh", "Mauja Hi Mauja", R.drawable.play));
        songs.add(new Songs("Mika Singh", "Dil Mein Baji Guiter", R.drawable.play));
        songs.add(new Songs("Baapi Lahiri", "Tune Maari Entriyaan", R.drawable.play));
        songs.add(new Songs("Arsar", "Afgan Jalebi", R.drawable.play));
        songs.add(new Songs("Neeraj Sridhar", "Aahun Aahun", R.drawable.play));
        songs.add(new Songs("Pritam", "Kamli", R.drawable.play));
        songs.add(new Songs("Arijit Singh", "Dil Sambhaal Zara", R.drawable.play));
        songs.add(new Songs("Atif Aslam", "Dekhte Dekhte", R.drawable.play));
        songs.add(new Songs("Neeraj Shridhar", "Twist", R.drawable.play));
        songs.add(new Songs("Shankar Mahadevan", "Desi Girl", R.drawable.play));
        songs.add(new Songs("Mika Singh", "Mauja Hi Mauja", R.drawable.play));
        songs.add(new Songs("Mika Singh", "Dil Mein Baji Guiter", R.drawable.play));
        songs.add(new Songs("Baapi Lahiri", "Tune Maari Entriyaan", R.drawable.play));
        songs.add(new Songs("Arsar", "Afgan Jalebi", R.drawable.play));
        songs.add(new Songs("Neeraj Sridhar", "Aahun Aahun", R.drawable.play));
        songs.add(new Songs("Pritam", "Kamli", R.drawable.play));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

