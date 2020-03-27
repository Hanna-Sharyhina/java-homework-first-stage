package com.training.java.collections.maintask.song.builders;

import com.training.java.collections.maintask.song.ArtSong;
import com.training.java.collections.maintask.song.genres.ArtSongGenres;

public class ArtSongBuilder extends SongBuilder {
    public ArtSongBuilder(){
        song = new ArtSong();
    }

    public ArtSongBuilder setComposer(String composer){
        ((ArtSong)song).setComposer(composer);
        return this;
    }
    public ArtSongBuilder setGenre(ArtSongGenres genre){
        ((ArtSong)song).setGenre(genre);
        return this;
    }
}
