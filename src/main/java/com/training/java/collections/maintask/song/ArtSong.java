package com.training.java.collections.maintask.song;

import com.training.java.collections.maintask.song.genres.ArtSongGenres;

public class ArtSong extends Song{
    private String composer;
    private ArtSongGenres genre;

    public ArtSong(){
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public ArtSongGenres getGenre() {
        return genre;
    }

    public void setGenre(ArtSongGenres genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArtSong)) return false;
        if (!super.equals(o)) return false;

        ArtSong artSong = (ArtSong) o;

        if (composer != null ? !composer.equals(artSong.composer) : artSong.composer != null) return false;
        return genre == artSong.genre;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (composer != null ? composer.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{Название = '" + getTitle() +
                "', стиль = '" + getStyle().getSongStyleName() +
                "', композитор = " + composer +
                ", жанр '" + genre.getArtSongGenreName() +
                "', продолжительность = " + (int)Math.floor(getDuration()) + ":" + (int)((getDuration() - Math.floor(getDuration()))*60) +
                '}'+ "\n";
    }
}
