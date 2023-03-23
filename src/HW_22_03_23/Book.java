package HW_22_03_23;

public class Book {
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

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return autor + " : " + bookName + " : " + pages + " | ";
    }

}
