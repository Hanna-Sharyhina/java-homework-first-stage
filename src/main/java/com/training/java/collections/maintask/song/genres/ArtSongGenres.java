package com.training.java.collections.maintask.song.genres;

public enum ArtSongGenres {
    SUITE("Сюита"),
    OPERA("Опера"),
    SYMPHONY("Симфония"),
    SONATA("Соната");

    private String artSongGenreName;

    ArtSongGenres(String artSongGenreName) {
        this.artSongGenreName = artSongGenreName;
    }

    public String getArtSongGenreName() {
        return artSongGenreName;
    }
}
