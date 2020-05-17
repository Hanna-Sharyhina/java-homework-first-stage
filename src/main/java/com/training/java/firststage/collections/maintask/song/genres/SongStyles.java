package com.training.java.firststage.collections.maintask.song.genres;

public enum SongStyles {
    ART("Классическая музыка"),
    FOLKLORE("Фольклор"),
    POP("Популярная музыка");

    private String songStyleName;

    SongStyles(String songStyleName) {
        this.songStyleName = songStyleName;
    }

    public String getSongStyleName() {
        return songStyleName;
    }
}
