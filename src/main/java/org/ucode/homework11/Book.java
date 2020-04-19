package org.ucode.homework11;

public class Book {
    protected long ISBN;
    protected String publisher;
    protected String author;
    protected String title;
    protected int year;
    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book() {
    }

    public Book(long ISBN, String publisher, String author, String title, int year, String type) {
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.author = author;
        this.title = title;
        this.year = year;
        this.type = type;
    }
}
