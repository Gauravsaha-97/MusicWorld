package com.example.android.musicworld;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs>{
    public SongAdapter(Activity context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items_list, parent, false);
        }


        Songs currentSong = getItem(position);


        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());


        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        ImageView imageId = (ImageView)listItemView.findViewById(R.id.play_music);
        imageId.setImageResource(currentSong.getImageId());


        return listItemView;
    }
}

