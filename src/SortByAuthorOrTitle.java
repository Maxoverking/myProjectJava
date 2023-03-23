import java.util.Comparator;

public class SortByAuthorOrTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int author = o1.getAutor().compareToIgnoreCase(o2.getAutor());
        if (author != 0) {
            return author;
        }
        return o1.getBookName().compareToIgnoreCase(o2.getBookName());

    }

}
