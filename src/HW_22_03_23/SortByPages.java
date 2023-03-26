package HW_22_03_23;

import java.util.Comparator;

public class SortByPages implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int bookPages = o2.getPages() - o1.getPages();
        if (bookPages != 0) {
            return bookPages;
        }
        return o1.getBookName().compareToIgnoreCase(o2.getBookName());
    }

}
