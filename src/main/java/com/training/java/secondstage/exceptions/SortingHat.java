package com.training.java.secondstage.exceptions;

import com.training.java.secondstage.exceptions.customexceptions.*;
import com.training.java.secondstage.exceptions.entities.Faculty;
import com.training.java.secondstage.exceptions.entities.Group;
import com.training.java.secondstage.exceptions.entities.Student;
import com.training.java.secondstage.exceptions.entities.University;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

import static com.training.java.secondstage.exceptions.FacultyNames.*;
import static com.training.java.secondstage.exceptions.StudySubjects.getStudySubjects;

public class SortingHat {
    Random random = new Random();
    private static final Logger LOGGER = Logger.getLogger(SortingHat.class.getSimpleName());
    private static List<String> allNames = new ArrayList<>();
    private List<String> slytherinNames = new ArrayList<>();
    private List<String> griffindorNames = new ArrayList<>();
    private List<String> hufflepuffNames = new ArrayList<>();
    private List<String> ravenclawNames = new ArrayList<>();

    public void getAllNamesFromFile() {
        try (BufferedReader reader
                     = new BufferedReader(new FileReader("src\\main\\resources\\StudentNames.txt"))) {
            reader.lines().forEach(allNames::add);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addNamesToEachFaculty() {
        getAllNamesFromFile();
        for (String name : allNames) {
            String[] nameWithIdentity = name.trim().split("/");
            if (nameWithIdentity[1].equalsIgnoreCase(String.valueOf(SLYTHERIN))) {
                slytherinNames.add(nameWithIdentity[0]);
            } else if (nameWithIdentity[1].equalsIgnoreCase(String.valueOf(GRYFFINDOR))) {
                griffindorNames.add(nameWithIdentity[0]);
            } else if (nameWithIdentity[1].equalsIgnoreCase(String.valueOf(HUFFLEPUFF))) {
                hufflepuffNames.add(nameWithIdentity[0]);
            } else if (nameWithIdentity[1].equalsIgnoreCase(String.valueOf(RAVENCLAW))) {
                ravenclawNames.add(nameWithIdentity[0]);
            }
        }
    }

    public Map<String, List<Integer>> addRandomGradesToEachStudySubject() throws GradeIsOutOfRangeException, StudentHasNoStudySubjectException {
        Map<String, List<Integer>> randomGrades = new HashMap<>();
        for (StudySubjects subject : getStudySubjects()) {
            List<Integer> randomGradesValues = new ArrayList<>();
            int numberOfGrades = random.nextInt(6) + 1;
            for (int i = 0; i < numberOfGrades; i++) {
                int randomGrade = random.nextInt(10) + 1;
                if (randomGrade <= 10 && randomGrade >= 1) {
                    randomGradesValues.add(randomGrade);
                } else throw new GradeIsOutOfRangeException();
            }
            randomGrades.put(subject.getStudySubjectsName(), randomGradesValues);
        }
        if (randomGrades.keySet().isEmpty()) {
            throw new StudentHasNoStudySubjectException();
        }
        return randomGrades;
    }

    public Group getRandomSlytherinGroup() throws GroupHasNoStudentException {
        List<Student> randomSlytherinGroup = new ArrayList<>();
        int numberOfStudents = (random.nextInt(slytherinNames.size()) + 1) / 3;
        for (int i = 0; i < numberOfStudents; i++) {
            try {
                randomSlytherinGroup.add(new Student(slytherinNames.get(i), addRandomGradesToEachStudySubject()));
                slytherinNames.remove(i);
            } catch (GradeIsOutOfRangeException | StudentHasNoStudySubjectException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (randomSlytherinGroup.isEmpty()) {
            throw new GroupHasNoStudentException();
        }
        String groupNumber = String.valueOf(random.nextInt(7) + 1);
        return new Group(groupNumber, randomSlytherinGroup);
    }

    public Group getRandomHufflepuffGroup() throws GroupHasNoStudentException {
        List<Student> randomHufflepuffGroup = new ArrayList<>();
        int numberOfStudents = (random.nextInt(hufflepuffNames.size()) + 1) / 3;
        for (int i = 0; i < numberOfStudents; i++) {
            try {
                randomHufflepuffGroup.add(new Student(hufflepuffNames.get(i), addRandomGradesToEachStudySubject()));
                hufflepuffNames.remove(i);
            } catch (GradeIsOutOfRangeException | StudentHasNoStudySubjectException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (randomHufflepuffGroup.isEmpty()) {
            throw new GroupHasNoStudentException();
        }
        String groupNumber = String.valueOf(random.nextInt(7) + 1);
        return new Group(groupNumber, randomHufflepuffGroup);
    }

    public Group getRandomGriffindorGroup() throws GroupHasNoStudentException {
        List<Student> randomGriffindorGroup = new ArrayList<>();
        int numberOfStudents = (random.nextInt(griffindorNames.size()) + 1) / 3;
        for (int i = 0; i < numberOfStudents; i++) {
            try {
                randomGriffindorGroup.add(new Student(griffindorNames.get(i), addRandomGradesToEachStudySubject()));
                griffindorNames.remove(i);
            } catch (GradeIsOutOfRangeException | StudentHasNoStudySubjectException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (randomGriffindorGroup.isEmpty()) {
            throw new GroupHasNoStudentException();
        }
        String groupNumber = String.valueOf(random.nextInt(7) + 1);
        return new Group(groupNumber, randomGriffindorGroup);
    }

    public Group getRandomRavenclawGroup() throws GroupHasNoStudentException {
        List<Student> randomRavenclawGroup = new ArrayList<>();
        int numberOfStudents = (random.nextInt(ravenclawNames.size()) + 1) / 3;
        for (int i = 0; i < numberOfStudents; i++) {
            try {
                randomRavenclawGroup.add(new Student(ravenclawNames.get(i), addRandomGradesToEachStudySubject()));
                ravenclawNames.remove(i);
            } catch (GradeIsOutOfRangeException | StudentHasNoStudySubjectException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (randomRavenclawGroup.isEmpty()) {
            throw new GroupHasNoStudentException();
        }
        String groupNumber = String.valueOf(random.nextInt(7) + 1);
        return new Group(groupNumber, randomRavenclawGroup);
    }

    public Faculty getGriffindorFaculty() throws FacultyHasNoGroupException {
        List<Group> griffindorGroups = new ArrayList<>();
        int numberOfGroups = random.nextInt(3) + 1;
        for (int i = 0; i < numberOfGroups; i++) {
            try {
                griffindorGroups.add(getRandomGriffindorGroup());
            } catch (GroupHasNoStudentException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (griffindorGroups.isEmpty()) {
            throw new FacultyHasNoGroupException();
        }
        return new Faculty(GRYFFINDOR, griffindorGroups);
    }

    public Faculty getSlytherinFaculty() throws FacultyHasNoGroupException {
        List<Group> slytherinGroups = new ArrayList<>();
        int numberOfGroups = random.nextInt(3) + 1;
        for (int i = 0; i < numberOfGroups; i++) {
            try {
                slytherinGroups.add(getRandomSlytherinGroup());
            } catch (GroupHasNoStudentException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (slytherinGroups.isEmpty()) {
            throw new FacultyHasNoGroupException();
        }
        return new Faculty(SLYTHERIN, slytherinGroups);
    }

    public Faculty getRavenclawFaculty() throws FacultyHasNoGroupException {
        List<Group> ravenclawGroups = new ArrayList<>();
        int numberOfGroups = random.nextInt(3) + 1;
        for (int i = 0; i < numberOfGroups; i++) {
            try {
                ravenclawGroups.add(getRandomRavenclawGroup());
            } catch (GroupHasNoStudentException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (ravenclawGroups.isEmpty()) {
            throw new FacultyHasNoGroupException();
        }
        return new Faculty(RAVENCLAW, ravenclawGroups);
    }

    public Faculty getHufflepuffFaculty() throws FacultyHasNoGroupException {
        List<Group> hufflepuffGroups = new ArrayList<>();
        int numberOfGroups = random.nextInt(3) + 1;
        for (int i = 0; i < numberOfGroups; i++) {
            try {
                hufflepuffGroups.add(getRandomHufflepuffGroup());
            } catch (GroupHasNoStudentException e) {
                LOGGER.warning(e.toString());
            }
        }
        if (hufflepuffGroups.isEmpty()) {
            throw new FacultyHasNoGroupException();
        }
        return new Faculty(HUFFLEPUFF, hufflepuffGroups);
    }

    public List<Faculty> addFacultiesToUniversity() throws UniversityHasNoFacultyException {
        List<Faculty> allFaculties = new ArrayList<>();
        try {
            allFaculties.add(getGriffindorFaculty());
            allFaculties.add(getSlytherinFaculty());
            allFaculties.add(getRavenclawFaculty());
            allFaculties.add(getHufflepuffFaculty());
        } catch (FacultyHasNoGroupException e) {
            LOGGER.warning(e.toString());
        }
        if (allFaculties.isEmpty()) {
            throw new UniversityHasNoFacultyException();
        }
        return allFaculties;
    }

    public University createUniversity() {
        addNamesToEachFaculty();
        List<Faculty> faculties = null;
        try {
            faculties = addFacultiesToUniversity();
        } catch (UniversityHasNoFacultyException e) {
            LOGGER.warning(e.toString());
        }
        return new University("Хогвартс", faculties);
    }
}
