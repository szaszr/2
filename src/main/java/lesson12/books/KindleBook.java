package lesson12.books;

public class KindleBook extends Book implements GenericBook, AnotherGenericBook {
    public KindleBook(String isbn) {
        super(isbn);
    }
}
