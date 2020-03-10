package org.ucode.homework11;

public class Hardcover extends Book {

    private Hardcover(long ISBN, String publisher, String author, String title, int year, String type) {
        super(ISBN, publisher, author, title, year, type);
    }

    private boolean hasHardCover = true;
}
