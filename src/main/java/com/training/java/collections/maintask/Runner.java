package com.training.java.collections.maintask;

import com.training.java.collections.maintask.tools.Controller;
import com.training.java.collections.maintask.tools.RecordingMusicCD;

public class Runner {
    public static void main(String[] args) {
        RecordingMusicCD recordingMusicCD = new RecordingMusicCD();
        recordingMusicCD.addSongs();
        Controller controller = new Controller();
        controller.runSampleByUserChoice();
    }
}
