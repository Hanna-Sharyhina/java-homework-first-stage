package com.training.java.collections.maintask.song;

import com.training.java.collections.maintask.song.genres.PopSongGenres;

public class PopSong extends Song{
    private String performer;
    private int releaseYear;
    private PopSongGenres genre;
    private String albumName;

    public PopSong(){
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public PopSongGenres getGenre() {
        return genre;
    }

    public void setGenre(PopSongGenres genre) {
        this.genre = genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PopSong)) return false;
        if (!super.equals(o)) return false;

        PopSong popSong = (PopSong) o;

        if (releaseYear != popSong.releaseYear) return false;
        if (performer != null ? !performer.equals(popSong.performer) : popSong.performer != null) return false;
        if (genre != popSong.genre) return false;
        return albumName != null ? albumName.equals(popSong.albumName) : popSong.albumName == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (performer != null ? performer.hashCode() : 0);
        result = 31 * result + releaseYear;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (albumName != null ? albumName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{Название = '" + getTitle() +
                "', стиль = '" + getStyle().getSongStyleName() +
                "', жанр = '" + genre.getPopSongGenreName()  +
                "', исполнитель = " + performer  +
                ", год выпуска = " + releaseYear +
                ", альбом = '" + albumName  +
                "', продолжительность = " + (int)Math.floor(getDuration()) + ":" + (int)((getDuration() - Math.floor(getDuration()))*60)+
                '}'+ "\n";
    }
}
