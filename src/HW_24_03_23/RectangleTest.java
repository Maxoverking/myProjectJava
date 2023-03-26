package HW_24_03_23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RectangleTest {
    @Test
    public void testCompare() {
        Rectangle r1 = new Rectangle(2, 4);
        Rectangle r2 = new Rectangle(3, 3);
        Rectangle r3 = new Rectangle(1, 5);

        List<Rectangle> rectangles = Arrays.asList(r1, r2, r3);
        rectangles.sort(new RectangleAreaComparator());

        assertEquals(r3, rectangles.get(0));
        assertEquals(r1, rectangles.get(1));
        assertEquals(r2, rectangles.get(2));
    }
}
