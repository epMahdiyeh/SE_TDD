import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquTest {
    @Test
    public void squTest() {
        Square square = new Square(6);
        double actualArea = square.computeArea();
        double expectedArea = 36;
        assertEquals(expectedArea, actualArea, 0.001);
    }
    @Test
    public void getSideTest() {
        Square square = new Square(4);
        double expectedSide = 4;
        double actualSide = square.getSide();
        assertEquals(expectedSide, actualSide, 0.001);
    }
    @Test
    public void setSideTest() {
        Square square = new Square(4);
        square.setSide(5);
        double actualSide = square.getSide();
        double expectedSide = 5;
        assertEquals(expectedSide, actualSide, 0.001);
    }
}