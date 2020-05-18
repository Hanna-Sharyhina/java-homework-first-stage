package com.training.java.secondstage.exceptions.customexceptions;

public class GroupHasNoStudentException extends Exception {
    public GroupHasNoStudentException() {
        super();
    }

    public GroupHasNoStudentException(String message) {
        super(message);
    }

    public GroupHasNoStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupHasNoStudentException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "Вгруппе отсутствуют студенты!";
    }
}
