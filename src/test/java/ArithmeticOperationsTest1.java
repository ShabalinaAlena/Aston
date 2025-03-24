import Lesson_12_testng.ArithmeticOperations;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticOperationsTest1 {
    @Test
    public void testAddition() {
        assertEquals(ArithmeticOperations.add(3, 5), 8);
    }

    @Test
    public void testSubtraction() {
        assertEquals(ArithmeticOperations.subtract(10, 4), 6);
    }

    @Test
    public void testMultiplication() {
        assertEquals(ArithmeticOperations.multiply(7, 3), 21);
    }

    @Test
    public void testDivision() {
        assertEquals(ArithmeticOperations.divide(10, 2), 5.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticOperations.divide(5, 0);
    }
}