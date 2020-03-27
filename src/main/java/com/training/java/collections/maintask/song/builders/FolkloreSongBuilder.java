package com.training.java.collections.maintask.song.builders;

import com.training.java.collections.maintask.song.FolkloreSong;
import com.training.java.collections.maintask.song.genres.NationBelonging;

public class FolkloreSongBuilder extends SongBuilder {

    public FolkloreSongBuilder(){
        song = new FolkloreSong();
    }

    public FolkloreSongBuilder setNationalBelonging(NationBelonging nationBelonging){
        ((FolkloreSong)song).setNationBelonging(nationBelonging);
        return this;
    }
}
