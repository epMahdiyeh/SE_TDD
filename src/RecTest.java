package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecTest {

    @Test
    public void recTest() {
        Rectangle rectangle = new Rectangle(5,8);
        double result = rectangle.calculateArea();
        double expected = 40;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(7, 3);
        rectangle.setWidth(2);
        double actualWidth = rectangle.getWidth();
        double expectedWidth = 2;
        assertEquals(expectedWidth, actualWidth, 0.001);
    }

    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle(9, 4);
        rectangle.setHeight(5);
        double actualHeight = rectangle.getHeight();
        double expectedHeight = 5;
        assertEquals(expectedHeight, actualHeight, 0.001);    }

}
