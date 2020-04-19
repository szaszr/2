package org.ucode.homework11;

import java.util.Scanner;

public class LibraryCleaner {

    public static void main(String[] args) {
        System.out.println("Welcome to the Robert's Library");
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            BookManager.menu();
            input = sc.next();
            if (input.equals("1")){
                BookManager.addBook();
            }
            else if (input.equals("2")){
                BookManager.listAllBooks();
            }
            else if (input.equals("3")){
                BookManager.rentBook();
            }
            else if (input.equals("4")){
                BookManager.returnBook();
            }
            else if (input.equals("5")){
                BookManager.authorSearch();
            }
            else if (input.equals("6")){
                BookManager.titleSearch();
            }
            else if (input.equals("7")){
                BookManager.typeSearch();
            }
        }
        while (!input.equals("8"));


    }
}
