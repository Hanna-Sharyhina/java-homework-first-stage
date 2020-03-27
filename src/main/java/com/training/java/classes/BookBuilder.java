package com.training.java.classes;

public class BookBuilder {
    protected Book book;

    BookBuilder(){
        book = new Book();
    }

    public BookBuilder setId (int id){
       book.setId(id);
       return this;
    }

    public BookBuilder setTitle(String title){
        book.setTitle(title);
        return this;
    }

    public BookBuilder setAuthorLastName(String authorLastName){
        book.setAuthorLastName(authorLastName);
        return this;
    }

    public BookBuilder setAuthorFirstName(String authorFirstName){
        book.setAuthorFirstName(authorFirstName);
        return this;
    }

    public BookBuilder setYear (int year){
        book.setReleaseYear(year);
        return this;
    }

    public BookBuilder setPublisher(String publisher){
        book.setPublisher(publisher);
        return this;
    }

    public BookBuilder setCover (String cover){
        book.setCover(cover);
        return this;
    }

    public BookBuilder setAmountPages(int amountPages){
        book.setAmountPages(amountPages);
        return this;
    }

    public BookBuilder setCost(double cost){
        book.setCost(cost);
        return this;
    }

    public Book build(){
        return book;
    }
}
