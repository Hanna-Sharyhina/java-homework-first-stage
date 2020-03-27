package com.training.java.classes;

import java.util.ArrayList;

public class Runner {

        private static final String HARDCOVER = "твердый переплет";
        private static final String PAPERBACK = "мягкая обложка";
        private static final String EKSMO_PUBLISHER = "Эксмо";
        private static final String AST_PUBLISHER = "АСТ";
        private static final String AZBUKA_PUBLISHER = "Азбука";

        public static void main(String[] args) {
            ArrayList<Book> allBooksArray = new ArrayList<>();
            allBooksArray.add(new BookBuilder()
                    .setId(1)
                    .setTitle("Три товарища")
                    .setAuthorFirstName("Эрих Мария")
                    .setAuthorLastName("Ремарк")
                    .setYear(2016)
                    .setPublisher(AST_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(384)
                    .setCost(14.01).build());

            allBooksArray.add(new BookBuilder()
                    .setId(2)
                    .setTitle("Белый Клык")
                    .setAuthorFirstName("Джек")
                    .setAuthorLastName("Лондон")
                    .setYear(2019)
                    .setPublisher("Махаон")
                    .setCover(HARDCOVER)
                    .setAmountPages(224)
                    .setCost(5.74).build());

            allBooksArray.add(new BookBuilder()
                    .setId(3)
                    .setTitle("Властелин колец")
                    .setAuthorFirstName("Джон")
                    .setAuthorLastName("Толкин")
                    .setYear(2018)
                    .setPublisher(AST_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(1120)
                    .setCost(29).build());

            allBooksArray.add(new BookBuilder()
                    .setId(4)
                    .setTitle("Сильмариллион")
                    .setAuthorFirstName("Джон")
                    .setAuthorLastName("Толкин")
                    .setYear(2014)
                    .setPublisher(AST_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(416)
                    .setCost(12.55).build());

            allBooksArray.add(new BookBuilder()
                    .setId(5)
                    .setTitle("Портрет Дориана Грея")
                    .setAuthorFirstName("Оскар")
                    .setAuthorLastName("Уайльд")
                    .setYear(2012)
                    .setPublisher(AZBUKA_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(416)
                    .setCost(7.55).build());

            allBooksArray.add(new BookBuilder()
                    .setId(6)
                    .setTitle("451° по Фаренгейту")
                    .setAuthorFirstName("Рэй")
                    .setAuthorLastName("Брэдбери")
                    .setYear(2011)
                    .setPublisher(EKSMO_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(272)
                    .setCost(9).build());

            allBooksArray.add(new BookBuilder()
                    .setId(7)
                    .setTitle("Мастер и Маргарита")
                    .setAuthorFirstName("Михаил")
                    .setAuthorLastName("Булгаков")
                    .setYear(2012)
                    .setPublisher(EKSMO_PUBLISHER)
                    .setCover(PAPERBACK)
                    .setAmountPages(544)
                    .setCost(7).build());

            allBooksArray.add(new BookBuilder()
                    .setId(8)
                    .setTitle("Quo Vadis")
                    .setAuthorFirstName("Генрих")
                    .setAuthorLastName("Сенкевич")
                    .setYear(2017)
                    .setPublisher(EKSMO_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(608)
                    .setCost(9).build());

            allBooksArray.add(new BookBuilder()
                    .setId(9)
                    .setTitle("Собачье сердце")
                    .setAuthorFirstName("Михаил")
                    .setAuthorLastName("Булгаков")
                    .setYear(2019)
                    .setPublisher(AST_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(480)
                    .setCost(8.99).build());

            allBooksArray.add(new BookBuilder()
                    .setId(10)
                    .setTitle("Сто лет одиночества")
                    .setAuthorFirstName("Габриэль")
                    .setAuthorLastName("Маркес")
                    .setYear(2007)
                    .setPublisher(AZBUKA_PUBLISHER)
                    .setCover(HARDCOVER)
                    .setAmountPages(368)
                    .setCost(16).build());

            SortingBooksByCriteria sortingBooksByCriteria = new SortingBooksByCriteria();
            sortingBooksByCriteria.createCriteriaForUserChoice();
            sortingBooksByCriteria.runSortingByCriteria(allBooksArray);
        }
}

