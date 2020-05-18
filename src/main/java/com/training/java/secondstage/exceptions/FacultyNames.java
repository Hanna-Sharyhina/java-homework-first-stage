package com.training.java.secondstage.exceptions;

public enum FacultyNames {
    SLYTHERIN("Слизерин"),
    HUFFLEPUFF("Пуфендуй"),
    RAVENCLAW("Когтевран"),
    GRYFFINDOR("Гриффиндор");

    private String facultyName;

    FacultyNames(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}
