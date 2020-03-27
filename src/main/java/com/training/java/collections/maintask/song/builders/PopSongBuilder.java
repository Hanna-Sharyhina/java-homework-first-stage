package com.training.java.collections.maintask.song.builders;

import com.training.java.collections.maintask.song.PopSong;
import com.training.java.collections.maintask.song.genres.PopSongGenres;

public class PopSongBuilder extends SongBuilder {

    public PopSongBuilder(){
        song = new PopSong();
    }

    public PopSongBuilder setGenre(PopSongGenres genre){
        ((PopSong)song).setGenre(genre);
        return this;
    }

    public PopSongBuilder setPerformer (String performer){
        ((PopSong)song).setPerformer(performer);
        return this;
    }

    public PopSongBuilder setReleaseYear(int releaseYear){
        ((PopSong)song).setReleaseYear(releaseYear);
        return this;
    }

    public PopSongBuilder setAlbumName (String albumName){
        ((PopSong)song).setAlbumName(albumName);
        return this;
    }
}
