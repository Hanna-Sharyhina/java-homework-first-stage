package com.training.java.firststage.collections.maintask.tools;

import com.training.java.firststage.collections.maintask.song.ArtSong;
import com.training.java.firststage.collections.maintask.song.FolkloreSong;
import com.training.java.firststage.collections.maintask.song.PopSong;
import com.training.java.firststage.collections.maintask.song.Song;
import com.training.java.firststage.collections.maintask.song.genres.ArtSongGenres;
import com.training.java.firststage.collections.maintask.song.genres.NationBelonging;
import com.training.java.firststage.collections.maintask.song.genres.PopSongGenres;
import com.training.java.firststage.collections.maintask.song.genres.SongStyles;

import java.util.ArrayList;
import java.util.List;

public class RecordingMusicCD {
    protected static List<Song> musicCD = new ArrayList<>();

    public void addSongs() {
        musicCD.add(new PopSong("Poison", "Alice Cooper", 4.52, SongStyles.POP, PopSongGenres.ROCK, 1989, "Trash"));
        musicCD.add(new PopSong("The chain", "Fleetwood Mac", 4.48, SongStyles.POP, PopSongGenres.ROCK, 1977, "Rumours"));
        musicCD.add(new PopSong("Love of my life", "Queen", 3.62, SongStyles.POP, PopSongGenres.ROCK, 1975, "A Night at the Opera"));
        musicCD.add(new PopSong("Stan", "Eminem", 6.73, SongStyles.POP, PopSongGenres.HIP_HOP, 2000, "The Marshall Mathers LP"));
        musicCD.add(new PopSong("Ich Will", "Rammstein", 3.62, SongStyles.POP, PopSongGenres.ROCK, 2001, "Mutter"));
        musicCD.add(new PopSong("Hurt", "Johnny Cash", 3.6, SongStyles.POP, PopSongGenres.COUNTRY, 2002, "American IV: The Man Comes Around"));
        musicCD.add(new PopSong("Strangers In The Night", "Frank Sinatra", 2.73, SongStyles.POP, PopSongGenres.JAZZ, 2010, "Strangers in the Night"));
        musicCD.add(new PopSong("Feeling good", "Nina Simone", 2.88, SongStyles.POP, PopSongGenres.JAZZ, 1965, "I Put a Spell on You"));
        musicCD.add(new PopSong("Thriller", "Michael Jackson", 5.22, SongStyles.POP, PopSongGenres.POP, 1982, "Thriller"));
        musicCD.add(new PopSong("Can't Help Falling in Love", "Elvis Presley", 3.02, SongStyles.POP, PopSongGenres.ROCK_AND_ROLL, 1961, "Blue Hawaii"));
        musicCD.add(new PopSong("Rock Around the Clock", "Bill Haley", 2.2, SongStyles.POP, PopSongGenres.ROCK_AND_ROLL, 1954, "Rock Around the Clock"));
        musicCD.add(new ArtSong("Clair de lune", "Claude Debussy", 4.77, SongStyles.ART, ArtSongGenres.SUITE));
        musicCD.add(new ArtSong("Una mattina", "Ludovico Einaudi", 3.37, SongStyles.ART, ArtSongGenres.SYMPHONY));
        musicCD.add(new ArtSong("Sonata №14", "Beethoven", 6.6, SongStyles.ART, ArtSongGenres.SONATA));
        musicCD.add(new ArtSong("Nessun dorma", "Giacomo Puccini", 3.52, SongStyles.ART, ArtSongGenres.OPERA));
        musicCD.add(new ArtSong("Sonata En Re Menor", "Domenico Scarlatti", 2.02, SongStyles.ART, ArtSongGenres.SONATA));
        musicCD.add(new FolkloreSong("Лявонiха", NationBelonging.BELARUS, 3.63, SongStyles.FOLKLORE));
        musicCD.add(new FolkloreSong("Тройка", NationBelonging.RUSSIAN, 3.5, SongStyles.FOLKLORE));
        musicCD.add(new FolkloreSong("Касiў Ясь канюшыну", NationBelonging.BELARUS, 4.22, SongStyles.FOLKLORE));
        musicCD.add(new FolkloreSong("Green sleeves", NationBelonging.ENGLAND, 3.73, SongStyles.FOLKLORE));
    }
}
