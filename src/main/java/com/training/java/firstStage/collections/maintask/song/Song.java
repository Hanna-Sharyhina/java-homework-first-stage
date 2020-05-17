package com.training.java.firstStage.collections.maintask.song;

import com.training.java.firstStage.collections.maintask.song.genres.SongStyles;

public abstract class Song {
    private String title;
    private double duration;
    private SongStyles style;

    public Song(String title, double duration, SongStyles style) {
        this.title = title;
        this.duration = duration;
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public SongStyles getStyle() {
        return style;
    }

    public void setStyle(SongStyles style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        Song song = (Song) o;

        if (Double.compare(song.duration, duration) != 0) return false;
        if (title != null ? !title.equals(song.title) : song.title != null) return false;
        return style == song.style;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (style != null ? style.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Song{" + "Название = '" + title + '\'' +
                ", стиль = " + style.getSongStyleName() +
                ", продолжительность = " + duration +
                '}';
    }
}
