package com.training.java.collections.maintask.song.builders;

import com.training.java.collections.maintask.song.Song;
import com.training.java.collections.maintask.song.genres.SongStyles;

public abstract class SongBuilder {
    protected Song song;

    public SongBuilder setTitle(String title){
        song.setTitle(title);
        return this;
    }

    public SongBuilder setStyle(SongStyles style){
        song.setStyle(style);
        return this;
    }

    public SongBuilder setDuration(double duration){
        song.setDuration(duration);
        return this;
    }

    public Song build(){
        return song;
    }
}

