package com.training.java.collections.maintask.tools;

import com.training.java.collections.maintask.song.Song;
import com.training.java.collections.maintask.song.builders.ArtSongBuilder;
import com.training.java.collections.maintask.song.builders.FolkloreSongBuilder;
import com.training.java.collections.maintask.song.builders.PopSongBuilder;
import com.training.java.collections.maintask.song.genres.ArtSongGenres;
import com.training.java.collections.maintask.song.genres.NationBelonging;
import com.training.java.collections.maintask.song.genres.PopSongGenres;
import com.training.java.collections.maintask.song.genres.SongStyles;

import java.util.ArrayList;
import java.util.List;

public class RecordingMusicCD {
    protected static List<Song> musicCD = new ArrayList<>();
    public void addSongs() {
        musicCD.add(new PopSongBuilder()
                .setPerformer("Alice Cooper")
                .setAlbumName("Trash")
                .setGenre(PopSongGenres.ROCK)
                .setReleaseYear(1989)
                .setTitle("Poison")
                .setStyle(SongStyles.POP)
                .setDuration(4.52).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Fleetwood Mac")
                .setAlbumName("Rumours")
                .setReleaseYear(1977)
                .setGenre(PopSongGenres.ROCK)
                .setTitle("The chain")
                .setStyle(SongStyles.POP)
                .setDuration(4.48).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Queen")
                .setAlbumName("A Night at the Opera")
                .setReleaseYear(1975)
                .setGenre(PopSongGenres.ROCK)
                .setTitle("Love of my life")
                .setStyle(SongStyles.POP)
                .setDuration(3.62).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Eminem")
                .setAlbumName("The Marshall Mathers LP")
                .setReleaseYear(2000)
                .setGenre(PopSongGenres.HIP_HOP)
                .setTitle("Stan")
                .setStyle(SongStyles.POP)
                .setDuration(6.73).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Rammstein")
                .setAlbumName("Mutter")
                .setReleaseYear(2001)
                .setGenre(PopSongGenres.ROCK)
                .setTitle("Ich Will")
                .setStyle(SongStyles.POP)
                .setDuration(3.62).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Johnny Cash")
                .setAlbumName("American IV: The Man Comes Around")
                .setReleaseYear(2002)
                .setGenre(PopSongGenres.COUNTRY)
                .setStyle(SongStyles.POP)
                .setTitle("Hurt")
                .setDuration(3.6).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Frank Sinatra")
                .setAlbumName("Strangers in the Night")
                .setReleaseYear(2010)
                .setGenre(PopSongGenres.JAZZ)
                .setTitle("Strangers In The Night")
                .setStyle(SongStyles.POP)
                .setDuration(2.73).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Nina Simone")
                .setAlbumName("I Put a Spell on You")
                .setReleaseYear(1965)
                .setGenre(PopSongGenres.JAZZ)
                .setTitle("Feeling good")
                .setStyle(SongStyles.POP)
                .setDuration(2.88).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Michael Jackson")
                .setAlbumName("Thriller")
                .setReleaseYear(1982)
                .setGenre(PopSongGenres.POP)
                .setTitle("Thriller")
                .setStyle(SongStyles.POP)
                .setDuration(5.22).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Elvis Presley")
                .setAlbumName("Blue Hawaii")
                .setReleaseYear(1961)
                .setGenre(PopSongGenres.ROCK_AND_ROLL)
                .setTitle("Can't Help Falling in Love")
                .setStyle(SongStyles.POP)
                .setDuration(3.02).build());
        musicCD.add(new PopSongBuilder()
                .setPerformer("Bill Haley")
                .setAlbumName("Rock Around the Clock")
                .setReleaseYear(1954)
                .setGenre(PopSongGenres.ROCK_AND_ROLL)
                .setTitle("Rock Around the Clock")
                .setStyle(SongStyles.POP)
                .setDuration(2.2).build());
        musicCD.add(new ArtSongBuilder()
                .setComposer("Claude Debussy")
                .setGenre(ArtSongGenres.SUITE)
                .setTitle("Clair de lune")
                .setStyle(SongStyles.ART)
                .setDuration(4.77).build());
        musicCD.add(new ArtSongBuilder()
                .setComposer("Ludovico Einaudi")
                .setGenre(ArtSongGenres.SYMPHONY)
                .setTitle("Una mattina")
                .setStyle(SongStyles.ART)
                .setDuration(3.37).build());
        musicCD.add(new ArtSongBuilder()
                .setComposer("Beethoven")
                .setGenre(ArtSongGenres.SONATA)
                .setTitle("Sonata №14")
                .setStyle(SongStyles.ART)
                .setDuration(6.6).build());
        musicCD.add(new ArtSongBuilder()
                .setComposer("Giacomo Puccini")
                .setGenre(ArtSongGenres.OPERA)
                .setTitle("Nessun dorma")
                .setStyle(SongStyles.ART)
                .setDuration(3.52).build());
        musicCD.add(new ArtSongBuilder()
                .setComposer("Domenico Scarlatti")
                .setGenre(ArtSongGenres.SONATA)
                .setTitle("Sonata En Re Menor")
                .setStyle(SongStyles.ART)
                .setDuration(2.02).build());
        musicCD.add(new FolkloreSongBuilder()
                .setNationalBelonging(NationBelonging.BELARUS)
                .setTitle("Лявонiха")
                .setStyle(SongStyles.FOLKLORE)
                .setDuration(3.63).build());
        musicCD.add(new FolkloreSongBuilder()
                .setNationalBelonging(NationBelonging.RUSSIAN)
                .setTitle("Тройка")
                .setStyle(SongStyles.FOLKLORE)
                .setDuration(3.5).build());
        musicCD.add(new FolkloreSongBuilder()
                .setNationalBelonging(NationBelonging.BELARUS)
                .setTitle("Касiў Ясь канюшыну")
                .setStyle(SongStyles.FOLKLORE)
                .setDuration(4.22).build());
        musicCD.add(new FolkloreSongBuilder()
                .setNationalBelonging(NationBelonging.ENGLAND)
                .setTitle("Green sleeves")
                .setStyle(SongStyles.FOLKLORE)
                .setDuration(3.73).build());
    }
}
