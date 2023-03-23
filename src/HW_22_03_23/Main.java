package HW_22_03_23;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> bookLists = new ArrayList<>();
        bookLists.add(new Book("Author 1", "Book 3", 150));
        bookLists.add(new Book("Author 2", "Book 2", 123));
        bookLists.add(new Book("Author 1", "Book 5", 252));
        bookLists.add(new Book("Author 3", "Book 1", 300));
        bookLists.add(new Book("Author 5", "Book 4", 300));
        Comparator<Book> sortAuthorOrTitle = new SortByAuthorOrTitle();
        bookLists.sort(sortAuthorOrTitle);
        for (Book book : bookLists) {
            System.out.println("book: " + book);
        }
        System.out.println(" ");
        Comparator<Book> sortPages = new SortByPages();
        bookLists.sort(sortPages);
        for (Book book : bookLists) {
            System.out.println("book: " + book);
        }

    }
}
