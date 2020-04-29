package com.training.java.collections.maintask.tools;

import com.training.java.collections.maintask.song.Song;
import com.training.java.collections.maintask.song.genres.SongStyles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import static com.training.java.collections.maintask.tools.RecordingMusicCD.musicCD;

public class SampleSongsByCriteria{

    private static final Logger LOGGER = Logger.getLogger(SampleSongsByCriteria.class.getSimpleName());
    private static final String FALSE_INPUT = "Неверный ввод. Попробуйте повторить. ";
    private String chosenStyle;
    double totalDuration = 0;

    public void calcTotalDuration(){
        for (Song song : musicCD){
            totalDuration += song.getDuration();
        }
    }
    public void outPutTotalDuration(){
        System.out.println("Общая продолжительность всех композиций : " +
                (int)Math.floor(totalDuration) + " минут " + (int)((totalDuration - Math.floor(totalDuration))*60) + " секунд");
    }

    public void findSongsWithDurationInChosenTimeRange(){
        double from;
        double to;
        List<Song> songsInChosenTimeRange = new ArrayList<>();
        System.out.println("Введите временной диапазон для поиска композиций: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()){
            from = scan.nextDouble();
            to = scan.nextDouble();
            for (Song song : musicCD){
                if (song.getDuration() >= from && song.getDuration() <= to){
                    songsInChosenTimeRange.add(song);
                }
            }
            System.out.println(songsInChosenTimeRange);
            if (songsInChosenTimeRange.isEmpty()){
                LOGGER.warning("Композиций в данном временном диапазоне не найдено! ");
                findSongsWithDurationInChosenTimeRange();
            }
        } else{
            LOGGER.warning(FALSE_INPUT);
            findSongsWithDurationInChosenTimeRange();
        }
    }

    public void sortSongsByStyle(){
        musicCD.sort(Comparator.comparing(Song::getStyle));
        System.out.println(musicCD);
    }

    public void setChosenStyle() {
        System.out.println("Введите один из жанров для выбора композиций: ");
        System.out.println(SongStyles.POP +" - " + SongStyles.POP.getSongStyleName() + ", " +
                            SongStyles.ART + " - " + SongStyles.ART.getSongStyleName() + ", " +
                            SongStyles.FOLKLORE + " - " + SongStyles.FOLKLORE.getSongStyleName());
        Scanner scanner = new Scanner(System.in);
        chosenStyle = scanner.next().trim();
    }

    public void selectSongsByUserChoice(){
        List<Song> chosenForListeningSongs = new ArrayList<>();
        for (Song song : musicCD){
            if (chosenStyle.equalsIgnoreCase(String.valueOf(song.getStyle())) ||
                    chosenStyle.equalsIgnoreCase(song.getStyle().getSongStyleName())){
                chosenForListeningSongs.add(song);
            }
        }
        System.out.println(chosenForListeningSongs);
        if (chosenForListeningSongs.isEmpty()){
            LOGGER.warning(FALSE_INPUT);
            setChosenStyle();
            selectSongsByUserChoice();
        }
    }
}
