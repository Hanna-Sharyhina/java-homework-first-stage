package com.training.java.collections.maintask.song.genres;

public enum NationBelonging {
    RUSSIAN("Русская"),
    BELARUS("Белорусская"),
    ENGLAND("Английская");

    private String nationBelongingName;

    NationBelonging(String nationBelongingName) {
        this.nationBelongingName = nationBelongingName;
    }

    public String getNationBelongingName() {
        return nationBelongingName;
    }
}
