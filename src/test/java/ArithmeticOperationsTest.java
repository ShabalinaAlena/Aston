import Lesson_12.ArithmeticOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {
    @Test
    void testAdd() {
        assertEquals(8, ArithmeticOperations.add(3, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(6, ArithmeticOperations.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(21, ArithmeticOperations.multiply(7, 3));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, ArithmeticOperations.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(5, 0));
    }
}