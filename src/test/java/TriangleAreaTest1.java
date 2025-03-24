import Lesson_12_testng.TriangleArea;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaTest1 {
    @Test
    public void testValidArea() {
        assertEquals(TriangleArea.calculateArea(4, 5), 10.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testZeroBase() {
        TriangleArea.calculateArea(0, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeHeight() {
        TriangleArea.calculateArea(4, -3);
    }
}