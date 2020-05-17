package com.training.java.firstStage.collections.maintask.song.genres;

public enum PopSongGenres {
    ROCK_AND_ROLL("Рок-н-ролл"),
    ROCK("Рок"),
    JAZZ("Джаз"),
    POP("Поп"),
    COUNTRY("Кантри"),
    HIP_HOP("Хип-Хоп");

    private String popSongGenreName;

    PopSongGenres(String popSongGenreName) {
        this.popSongGenreName = popSongGenreName;
    }

    public String getPopSongGenreName() {
        return popSongGenreName;
    }
}
