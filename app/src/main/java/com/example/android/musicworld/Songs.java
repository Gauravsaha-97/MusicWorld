package com.example.android.musicworld;

public class Songs {
    private String mArtistName;
    private String mSongName;
    private int mImageId;
    public Songs(String artistName, String songName, int imageId){
        mArtistName = artistName;
        mSongName = songName;
        mImageId = imageId;

    }
    public String getArtistName()
    {
        return mArtistName;
    }
    public String getSongName(){
        return mSongName;
    }
    public int getImageId(){
        return mImageId;
}
}
