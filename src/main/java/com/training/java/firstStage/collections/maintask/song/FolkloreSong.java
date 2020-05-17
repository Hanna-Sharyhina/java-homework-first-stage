package com.training.java.firstStage.collections.maintask.song;

import com.training.java.firstStage.collections.maintask.song.genres.NationBelonging;
import com.training.java.firstStage.collections.maintask.song.genres.SongStyles;

public class FolkloreSong extends Song {
    private NationBelonging nationBelonging;

    public FolkloreSong(String title, NationBelonging nationBelonging, double duration, SongStyles style) {
        super(title, duration, style);
        this.nationBelonging = nationBelonging;
    }

    public NationBelonging getNationBelonging() {
        return nationBelonging;
    }

    public void setNationBelonging(NationBelonging nationBelonging) {
        this.nationBelonging = nationBelonging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FolkloreSong)) return false;
        if (!super.equals(o)) return false;

        FolkloreSong that = (FolkloreSong) o;

        return nationBelonging == that.nationBelonging;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (nationBelonging != null ? nationBelonging.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{Название = '" + getTitle() +
                "', стиль = '" + getStyle().getSongStyleName() +
                "', принадлежность = " + nationBelonging.getNationBelongingName() + " народная" +
                ", продолжительность = " + (int) Math.floor(getDuration()) + ":" + (int) ((getDuration() - Math.floor(getDuration())) * 60) +
                '}' + "\n";
    }
}
