package HW_22_03_23;

import java.util.Comparator;

public class SortByPages implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int booPages = o2.getPages() - o1.getPages();
        if (booPages != 0) {
            return booPages;
        }
        return o1.getBookName().compareToIgnoreCase(o2.getBookName());
    }

}
