package org.ucode.homework11;

public class Kindle extends Book {


    private Kindle(long ISBN, String publisher, String author, String title, int year, String type) {
        super(ISBN, publisher, author, title, year, type);
    }

    private boolean onlyAvailableOnKindle = true;
}
