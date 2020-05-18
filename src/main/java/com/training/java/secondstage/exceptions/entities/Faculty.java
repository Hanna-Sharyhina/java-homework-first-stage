package com.training.java.secondstage.exceptions.entities;

import com.training.java.secondstage.exceptions.FacultyNames;

import java.util.List;

public class Faculty {
    private FacultyNames name;
    private List<Group> groups;

    public Faculty(FacultyNames name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public FacultyNames getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;

        Faculty faculty1 = (Faculty) o;

        if (name != faculty1.name) return false;
        return groups != null ? groups.equals(faculty1.groups) : faculty1.groups == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Факультет: "  + name.getFacultyName()+ ",\n" +
                " группы: \n" + groups +
                '}';
    }
}