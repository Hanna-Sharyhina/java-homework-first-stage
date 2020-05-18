package com.training.java.secondstage.exceptions.entities;

import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;

        University that = (University) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return faculties != null ? faculties.equals(that.faculties) : that.faculties == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (faculties != null ? faculties.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Университет '" + name + "'\n" +
                "Факультеты: \n" + faculties;
    }
}
