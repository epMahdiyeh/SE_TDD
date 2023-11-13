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

}
