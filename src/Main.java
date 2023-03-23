import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Book> bookLists = new ArrayList<>();
        bookLists.add(new Book("Author 1", "Book 3", 150));
        bookLists.add(new Book("Author 2", "Book 2", 123));
        bookLists.add(new Book("Author 1", "Book 5", 252));
        Comparator<Book> sortAuthorOrTitle = new SortByAuthorOrTitle();
        Collections.sort(bookLists, sortAuthorOrTitle);
        for (Book book : bookLists) {
            System.out.println("book: " + book);
        }
        System.out.println(" ");
        Comparator<Book> sortPages = new SortByPages();
        Collections.sort(bookLists, sortPages);
        for (Book book : bookLists) {
            System.out.println("book: " + book);
        }

    }
}
