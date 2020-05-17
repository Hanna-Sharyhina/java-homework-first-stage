package com.training.java.firstStage.classes;

public class Book {
    private int id;
    private String title;
    private String authorLastName;
    private String authorFirstName;
    private int releaseYear;
    private String publisher;
    private String cover;
    private int amountPages;
    private double cost;

    public Book(int id, String title, String authorLastName, String authorFirstName, int releaseYear, String publisher, String cover, int amountPages, double cost) {
        this.id = id;
        this.title = title;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.releaseYear = releaseYear;
        this.publisher = publisher;
        this.cover = cover;
        this.amountPages = amountPages;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCover() {
        return cover;
    }

    public int getAmountPages() {
        return amountPages;
    }

    public double getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setAmountPages(int amountPages) {
        this.amountPages = amountPages;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (releaseYear != book.releaseYear) return false;
        if (amountPages != book.amountPages) return false;
        if (Double.compare(book.cost, cost) != 0) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (authorLastName != null ? !authorLastName.equals(book.authorLastName) : book.authorLastName != null)
            return false;
        if (authorFirstName != null ? !authorFirstName.equals(book.authorFirstName) : book.authorFirstName != null)
            return false;
        if (publisher != null ? !publisher.equals(book.publisher) : book.publisher != null) return false;
        return cover != null ? cover.equals(book.cover) : book.cover == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (authorLastName != null ? authorLastName.hashCode() : 0);
        result = 31 * result + (authorFirstName != null ? authorFirstName.hashCode() : 0);
        result = 31 * result + releaseYear;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (cover != null ? cover.hashCode() : 0);
        result = 31 * result + amountPages;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Book{" + "id: " + id +
                ", Название: '" + title + '\'' +
                ", Автор: '" + authorFirstName +
                " " + authorLastName + '\'' +
                ", Год издания: " + releaseYear +
                ", Издатель: '" + publisher + '\'' +
                ", Обложка: '" + cover + '\'' +
                ", Количество страниц: " + amountPages +
                ", Цена: " + cost +
                " BYN" +
                '}';
    }
}