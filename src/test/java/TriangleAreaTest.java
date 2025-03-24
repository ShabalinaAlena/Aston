import Lesson_12.TriangleArea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {
    @Test
    void testAreaWithValidInput() {
        assertEquals(10.0, TriangleArea.calculateArea(4, 5));
    }

    @Test
    void testAreaWithZeroInput() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(0, 5));
    }

    @Test
    void testAreaWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(-3, 4));
    }
}