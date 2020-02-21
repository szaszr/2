package org.ucode.homework11;

public class Audiobook extends Book {


    private Audiobook(long ISBN, String publisher, String author, String title, int year, String type) {
        super(ISBN, publisher, author, title, year, type);
    }
    private boolean canListenToIt = true;
}
