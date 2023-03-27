package HW_24_03_23;

import java.util.Comparator;

class RectangleAreaComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return Integer.compare(o1.getRectangleArea(), o2.getRectangleArea());
    }
}
