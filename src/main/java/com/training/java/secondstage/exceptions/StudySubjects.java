package com.training.java.secondstage.exceptions;

import java.util.ArrayList;
import java.util.List;

public enum StudySubjects {
    CHARMS("Заклинания"),
    HISTORY_OF_MAGIC("История магии"),
    TRANSFIGURATION("Трансфигурация"),
    DEFENCE_AGAINST_THE_DARK_ARTS("Защита от темных искусств"),
    POTIONS("Зельеварение"),
    HERBOLOGY("Травология");

    public static List<StudySubjects> getStudySubjects() {
        List<StudySubjects> studySubjects = new ArrayList<>();
        studySubjects.add(CHARMS);
        studySubjects.add(HISTORY_OF_MAGIC);
        studySubjects.add(TRANSFIGURATION);
        studySubjects.add(DEFENCE_AGAINST_THE_DARK_ARTS);
        studySubjects.add(POTIONS);
        studySubjects.add(HERBOLOGY);
        return studySubjects;
    }

    private String studySubjectsName;

    StudySubjects(String studySubjectsName) {
        this.studySubjectsName = studySubjectsName;
    }

    public String getStudySubjectsName() {
        return studySubjectsName;
    }
}
