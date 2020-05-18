package com.training.java.secondstage.exceptions.entities;

import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    public Group(String name, List<Student> students){
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group group = (Group) o;

        if (name != null ? !name.equals(group.name) : group.name != null) return false;
        return students != null ? students.equals(group.students) : group.students == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  "Группа '" + name + " курс"+ "'\n" + students;
    }
}
