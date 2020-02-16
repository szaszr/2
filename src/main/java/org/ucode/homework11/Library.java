package org.ucode.homework11;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> inventory = new ArrayList<Book>();
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        ArrayList<Book> borrowedBooks = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Robert's Library");
        String input;
        do {
            System.out.println("Please choose from the following options: ");
            System.out.println("\t1. Add a new book.");
            System.out.println("\t2. List all the books");
            System.out.println("\t3. Borrow a book");
            System.out.println("\t4. Return a book");
            System.out.println("\t5. Search all available books by Author");
            System.out.println("\t6. Search all available books by Title");
            System.out.println("\t7. Search all available books by Type");
            System.out.println("\t8. Quit program");
            System.out.println(">");

            input = sc.next();

            if (input.equals("1")){
                System.out.println("Please specify the ISBN");
                long isbn = sc.nextLong();
                String lengthOfISBN = Long.toString(isbn);
                while (lengthOfISBN.length()<10){
                    System.out.println("Please make sure that the ISBN is correct, it should be at least 10 characters long or 13 if the book was published after 2007");
                    isbn = sc.nextLong();
                    lengthOfISBN = Long.toString(isbn);
                }

                System.out.println("Please specify the publisher");
                String publisher = sc.next();
                while (publisher.length() > 50) {
                    System.out.println("Publisher can not be equal to or more than 50 characters. Please try again");
                    publisher = sc.next();
                }

                System.out.println("Please specify the author");
                String author = sc.next();
                while (author.length() > 50) {
                    System.out.println("Author can not be equal to or more than 50 characters. Please try again");
                    author = sc.next();
                }

                System.out.println("Please specify the title");
                String title = sc.next();
                while (title.length() > 50) {
                    System.out.println("Title can not be equal to or more than 50 characters. Please try again");
                    title = sc.next();
                }

                System.out.println("Please specify the year the book was published");
                int year = sc.nextInt();
                while (year < 1454 || year > 2020){
                    while (year < 1454){
                        System.out.println("Calm down you do not have an older book that the first edition Gutenberg Bible.Please make sure the year is correct.");
                        year = sc.nextInt();
                    }
                    while (year > 2020){
                        System.out.println("Calm down Marty McFly you do not have a book from the future. Please make sure the year is correct.");
                        year = sc.nextInt();
                    }
                }

                System.out.println("Please specify the type");

                inventory.add(new Book(isbn, publisher, author, title, year));
                availableBooks.add(new Book(isbn, publisher, author, title, year));
                System.out.println("New book successfully added");
            }
            else if (input.equals("2")){
                for (int i = 0; i < inventory.size(); i++) {
                    System.out.println("book ISBN: " + inventory.get(i).getISBN());
                    System.out.println("publisher: " + inventory.get(i).getPublisher());
                    System.out.println("author: " + inventory.get(i).getAuthor());
                    System.out.println("title: " + inventory.get(i).getTitle());
                    System.out.println("year: " + inventory.get(i).getYear());
                    System.out.println();
                }
            }
            else if (input.equals("3")){
                System.out.println("Please specify the ISBN of the book you would like to rent:");
                long borrow = sc.nextLong();

            }
        }
        while (!input.equals("8"));
    }
}
