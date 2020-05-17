package com.training.java.firstStage.classes;

import java.util.ArrayList;

public class Runner {
    private static final String HARDCOVER = "твердый переплет";
    private static final String PAPERBACK = "мягкая обложка";
    private static final String EKSMO_PUBLISHER = "Эксмо";
    private static final String AST_PUBLISHER = "АСТ";
    private static final String AZBUKA_PUBLISHER = "Азбука";
    private static final String MAXAON_PUBLISHER = "Махаон";

    public static void main(String[] args) {
        ArrayList<Book> allBooksArray = new ArrayList<>();
        allBooksArray.add(new Book(1, "Три товарища", "Ремарк", "Эрих Мария", 2016, AST_PUBLISHER, HARDCOVER, 384, 14.01));
        allBooksArray.add(new Book(2, "Белый Клык", "Лондон", "Джек", 2019, MAXAON_PUBLISHER, HARDCOVER, 224, 5.74));
        allBooksArray.add(new Book(3, "Властелин колец", "Толкин", "Джон", 2018, AST_PUBLISHER, HARDCOVER, 1120, 29));
        allBooksArray.add(new Book(4, "Сильмариллион", "Толкин", "Джон", 2014, AST_PUBLISHER, HARDCOVER, 416, 12.55));
        allBooksArray.add(new Book(5, "Портрет Дориана Грея", "Уайльд", "Оскар", 2012, AZBUKA_PUBLISHER, HARDCOVER, 416, 7.55));
        allBooksArray.add(new Book(6, "451° по Фаренгейту", "Брэдбери", "Рэй", 2011, EKSMO_PUBLISHER, HARDCOVER, 272, 9));
        allBooksArray.add(new Book(7, "Мастер и Маргарита", "Булгаков", "Михаил", 2012, EKSMO_PUBLISHER, PAPERBACK, 544, 7));
        allBooksArray.add(new Book(8, "Quo Vadis", "Сенкевич", "Генрих", 2017, EKSMO_PUBLISHER, HARDCOVER, 608, 9));
        allBooksArray.add(new Book(9, "Собачье сердце", "Булгаков", "Михаил", 2019, AST_PUBLISHER, HARDCOVER, 480, 8.99));
        allBooksArray.add(new Book(10, "Сто лет одиночества", "Маркес", "Габриэль", 2007, AZBUKA_PUBLISHER, HARDCOVER, 368, 16));

        SortingBooksByCriteria sortingBooksByCriteria = new SortingBooksByCriteria();
        sortingBooksByCriteria.runSortingByCriteria(allBooksArray);
    }
}

