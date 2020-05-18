package com.training.java.secondstage.exceptions;

import com.training.java.secondstage.exceptions.entities.Faculty;
import com.training.java.secondstage.exceptions.entities.Group;
import com.training.java.secondstage.exceptions.entities.Student;
import com.training.java.secondstage.exceptions.entities.University;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import static com.training.java.secondstage.exceptions.FacultyNames.*;
import static com.training.java.secondstage.exceptions.StudySubjects.*;

public class Controller {
    private static final Logger LOGGER = Logger.getLogger(Controller.class.getSimpleName());
    private static final String FALSE_INPUT = "Ввод осуществлен неверно. Попробуйте повторить. ";
    private String criteria;
    private static String userChosenSubject;
    private static Faculty userChosenFaculty;
    private static Group userChosenGroup;
    Random random = new Random();
    DecimalFormat formattedDouble = new DecimalFormat("#0.00");
    static SortingHat sortingHat = new SortingHat();
    static final University university = sortingHat.createUniversity();

    public void createCriteriaForUserChoice() {
        String menuForUserChoose = "Введите номер действия, где: \n" +
                "1 - Посчитать средний балл по всем предметам студента. \n" +
                "2 - Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете. \n" +
                "3 - Посчитать средний балл по предмету для всего университета. \n" +
                "4 - Выход из приложения. \n";
        LOGGER.info(menuForUserChoose);
        Scanner scan = new Scanner(System.in);
        criteria = scan.next().trim();
    }

    public void runByUserChoice() {
        while (true) {
            createCriteriaForUserChoice();
            switch (criteria) {
                case "1":
                    calcRandomStudentAverageGrade();
                    break;
                case "2":
                    calcAverageGradeForSpecificStudySubjectInSpecificGroupAtSpecificFaculty();
                    break;
                case "3":
                    calcAverageGradeForSpecificStudySubjectAtWholeUniversity();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    LOGGER.warning("Неверный ввод. Попробуйте повторить. ");
            }
        }
    }

    public static void setUserChosenSubject() {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Выберите один из предметов: \n" +
                HERBOLOGY.getStudySubjectsName() + ", " + POTIONS.getStudySubjectsName() + ", " +
                DEFENCE_AGAINST_THE_DARK_ARTS.getStudySubjectsName() + ", " + TRANSFIGURATION.getStudySubjectsName() + ", " +
                HISTORY_OF_MAGIC.getStudySubjectsName() + ", " + CHARMS.getStudySubjectsName());
        userInput = scanner.next().trim();
        for (StudySubjects subject : getStudySubjects()) {
            if (userInput.equalsIgnoreCase(subject.getStudySubjectsName())) {
                userChosenSubject = subject.getStudySubjectsName();
                break;
            }
        }
        if (userChosenSubject == null) {
            LOGGER.warning(FALSE_INPUT);
            setUserChosenSubject();
        }
    }

    public static void setUserChosenFaculty() {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Выберите факультет из предложенных :\n" +
                SLYTHERIN.getFacultyName() + ", " + GRYFFINDOR.getFacultyName() + ", " +
                RAVENCLAW.getFacultyName() + ", " + HUFFLEPUFF.getFacultyName());
        userInput = scanner.next().trim();
        for (Faculty faculty : university.getFaculties()) {
            if (userInput.equalsIgnoreCase(faculty.getName().getFacultyName())) {
                userChosenFaculty = faculty;
                break;
            }
        }
        if (userChosenFaculty == null) {
            LOGGER.warning(FALSE_INPUT);
            setUserChosenFaculty();
        }
    }

    public static void setUserChosenGroup() {
        setUserChosenFaculty();
        String userInput;
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Выберите номер группы из предложенных: \n");
        for (Group group : userChosenFaculty.getGroups()) {
            LOGGER.info(group.getName() + " группа");
        }
        userInput = scanner.next().trim();
        for (Group group : userChosenFaculty.getGroups()) {
            if (userInput.equals(group.getName())) {
                userChosenGroup = group;
            }
        }
        if (userChosenGroup == null) {
            LOGGER.warning(FALSE_INPUT);
            setUserChosenGroup();
        }
    }

    public void calcRandomStudentAverageGrade() {
        Faculty randomFaculty = university.getFaculties().get(random.nextInt(university.getFaculties().size()));
        Group randomGroup = randomFaculty.getGroups().get(random.nextInt(randomFaculty.getGroups().size()));
        Student randomStudent = randomGroup.getStudents().get(random.nextInt(randomGroup.getStudents().size()));
        double avarageGrade = 0;
        int sumOfGrades = 0;
        int numberOfAllGrades = 0;
        for (List<Integer> gradesOfOneStudySubject : randomStudent.getGrades().values()) {
            for (Integer grade : gradesOfOneStudySubject) {
                sumOfGrades += grade;
                numberOfAllGrades++;
            }
        }
        if (numberOfAllGrades > 0) {
            avarageGrade = sumOfGrades / (double) numberOfAllGrades;
        }
        String message = "Студент " + randomStudent.getName() + " группы " + randomGroup.getName() + " курса " + randomFaculty.getName().getFacultyName() + " имеет средний балл: " + formattedDouble.format(avarageGrade) + ", его оценки:\n" + randomStudent.getGrades();
        LOGGER.info(message);
    }

    public void calcAverageGradeForSpecificStudySubjectInSpecificGroupAtSpecificFaculty() {
        setUserChosenGroup();
        setUserChosenSubject();
        double averageGrade = 0;
        int sumOfGrades = 0;
        int numberOfAllGrades = 0;
        for (Student student : userChosenGroup.getStudents()) {
            if (student.getGrades().containsKey(userChosenSubject)) {
                for (List<Integer> gradesOfOneStudySubject : student.getGrades().values()) {
                    for (Integer grade : gradesOfOneStudySubject) {
                        sumOfGrades += grade;
                        numberOfAllGrades++;
                    }
                }
            }
        }
        if (numberOfAllGrades > 0) {
            averageGrade = sumOfGrades / (double) numberOfAllGrades;
        }
        String message = "Средняя оценка в группе " + userChosenGroup.getName() + " " + userChosenFaculty.getName().getFacultyName() +
                " по предмету " + userChosenSubject + " равна: " + formattedDouble.format(averageGrade);
        LOGGER.info(message);
    }

    public List<Student> getAllUniversityStudents() {
        List<Student> allStudentsOfUniversity = new ArrayList<>();
        for (Faculty faculty : university.getFaculties()) {
            for (Group group : faculty.getGroups()) {
                allStudentsOfUniversity.addAll(group.getStudents());
            }
        }
        return allStudentsOfUniversity;
    }

    public void calcAverageGradeForSpecificStudySubjectAtWholeUniversity() {
        setUserChosenSubject();
        double averageGrade = 0;
        int sumOfGrades = 0;
        int numberOfAllGrades = 0;
        for (Student student : getAllUniversityStudents()) {
            if (student.getGrades().containsKey(userChosenSubject)) {
                for (List<Integer> gradesOfOneStudySubject : student.getGrades().values()) {
                    for (Integer grade : gradesOfOneStudySubject) {
                        sumOfGrades += grade;
                        numberOfAllGrades++;
                    }
                }
            }
        }
        if (numberOfAllGrades > 0) {
            averageGrade = sumOfGrades / (double) numberOfAllGrades;
        }
        String message = "Средняя оценка по предмету '" + userChosenSubject + "' для всего университета равна: " + formattedDouble.format(averageGrade);
        LOGGER.info(message);
    }
}
