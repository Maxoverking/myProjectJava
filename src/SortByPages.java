import java.util.Comparator;

public class SortByPages implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int bookName = o2.getPages() - o1.getPages();
        if (bookName != 0) {
            return bookName;
        }
        return o1.getBookName().compareToIgnoreCase(o2.getBookName());
    }

}
