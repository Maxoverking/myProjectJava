package HW_21_03_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book implements Comparable<Book> {
    private final String autor;
    private final String bookName;
    private final int pages;

    public Book(String autor, String bookName, int pages) {
        this.autor = autor;
        this.bookName = bookName;
        this.pages = pages;
    }

    public String getAutor() {
        return autor;
    }

    public String getBookName() {
        return bookName;
    }

    public int getpages() {
        return pages;
    }

    public static Book bookInformation() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите автора: ");
        String autor = br.readLine();
        System.out.print("Введите название книги : ");
        String bookName = br.readLine();
        System.out.print("Введите количество страниц : ");
        int pages = Integer.parseInt(br.readLine());

        return new Book(autor, bookName, pages);
    }

    @Override
    public int compareTo(Book otherBook) {
        boolean sameAuthor = autor.equals(otherBook.autor);
        if (!sameAuthor) {
            return autor.compareTo(otherBook.autor);
        }
        return bookName.compareTo(otherBook.bookName);
    }

    @Override
    public String toString() {
        return autor + " : " + bookName + " : " + pages + " | ";
    }

}
