package org.ucode.homework11;

public class Paperback extends Book {


    private Paperback(long ISBN, String publisher, String author, String title, int year, String type) {
        super(ISBN, publisher, author, title, year, type);
    }
    private boolean madeOutOfPaper = true;
}
