package com.training.java.firstStage.classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class SortingBooksByCriteria {
    private String choiceCriteria;
    private String chosenAuthorLastName;
    private String chosenPublisher;
    private int chosenReleaseYear;
    private static final String FALSE_INPUT = "Ошибка ввода, попробуйте повторить. ";
    private static final Logger LOGGER = Logger.getLogger(SortingBooksByCriteria.class.getSimpleName());

    void createCriteriaForUserChoice() {
        System.out.println("Введите критерий выбора книг, где: ");
        System.out.println("1 - Выбор книг по автору. ");
        System.out.println("2 - Выбор книг по заданному издательству. ");
        System.out.println("3 - Выбор книг, выпущенных после определенного года. ");
        Scanner scanner = new Scanner(System.in);
        choiceCriteria = scanner.next().trim();
    }

    void runSortingByCriteria(ArrayList<Book> allBooksArray) {
        createCriteriaForUserChoice();
        switch (choiceCriteria) {
            case "1":
                setChosenAuthor();
                createArrayByChosenAuthor(allBooksArray);
                break;
            case "2":
                setChosenPublisher();
                createArrayByChosenPublisher(allBooksArray);

                break;
            case "3":
                setChosenYear();
                createArrayByChosenYear(allBooksArray);
                break;
            default:
                LOGGER.warning(FALSE_INPUT);
                runSortingByCriteria(allBooksArray);
        }
    }

    private void setChosenAuthor() {
        System.out.println("Выберите автора из предложенных: \nРемарк, Лондон, Толкин, Уайльд, Брэдберри, Булгаков, Сенкевич, Маркес.");
        Scanner scan = new Scanner(System.in);
        chosenAuthorLastName = scan.next().trim();
    }

    private void createArrayByChosenAuthor(ArrayList<Book> allBooksArray) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : allBooksArray) {
            if (book.getAuthorLastName().equalsIgnoreCase(chosenAuthorLastName)) {
                booksByAuthor.add(book);
            }
        }
        if (booksByAuthor.isEmpty()) {
            LOGGER.warning("Книг, выпущенных данным автором - не найдено. Попробуйте повторить ввод. ");
            setChosenAuthor();
            createArrayByChosenAuthor(allBooksArray);
        }
        booksByAuthor.forEach(System.out::println);
    }

    private void setChosenPublisher() {
        System.out.println("Выберите издательство из предложенных: \nАСТ, Махаон, Азбука, Эксмо. ");
        Scanner scan = new Scanner(System.in);
        chosenPublisher = scan.next().trim();
    }

    private void createArrayByChosenPublisher(ArrayList<Book> allBooksArray) {
        ArrayList<Book> booksByPublisher = new ArrayList<>();
        for (Book book : allBooksArray) {
            if (book.getPublisher().equalsIgnoreCase(chosenPublisher)) {
                booksByPublisher.add(book);
            }
        }
        if (booksByPublisher.isEmpty()) {
            LOGGER.warning("Книг, выпущенных данным издателем - не найдено. Попробуйте повторить ввод. ");
            setChosenPublisher();
            createArrayByChosenPublisher(allBooksArray);
        }
        booksByPublisher.forEach(System.out::println);
    }

    private void setChosenYear() {
        System.out.println("Задайте год: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            chosenReleaseYear = scan.nextInt();
        } else {
            LOGGER.warning(FALSE_INPUT);
            setChosenYear();
        }
    }

    private void createArrayByChosenYear(ArrayList<Book> allBooksArray) {
        ArrayList<Book> booksByYear = new ArrayList<>();
        for (Book book : allBooksArray) {
            if (book.getReleaseYear() >= chosenReleaseYear) {
                booksByYear.add(book);
            }
        }
        if (booksByYear.isEmpty()) {
            LOGGER.warning("Книг, выпущенных после заданного года - не найдено. Попробуйте повторить ввод. ");
            setChosenYear();
            createArrayByChosenYear(allBooksArray);
        }
        booksByYear.forEach(System.out::println);
    }
}
