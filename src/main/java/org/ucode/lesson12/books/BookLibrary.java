package org.ucode.lesson12.books;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private List<Book> availableBooks;
    private List<Book> rentedBooks;

    public BookLibrary() {
        availableBooks = new ArrayList<>();
        rentedBooks = new ArrayList<>();
    }

    public boolean rentABook(String isbn){
        for (Book availableBook : availableBooks) {
            if (availableBook.getIsbn().equals(isbn)){
                availableBooks.remove(availableBook);
                rentedBooks.add(availableBook);
                return true;
            }
        }

        return false;
    }

    public void addKindleBook(){

    }

    public void addBook(String isbn, String type){
        Book book = null;

        if (type.equals("Kindle")){
            book = new KindleBook("123");
        }
        
        availableBooks.add(book);
    }

    public List<Book> getAllAvailableBooks(){
        return availableBooks;
    }
}
