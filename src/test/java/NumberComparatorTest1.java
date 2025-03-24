import Lesson_12_testng.NumberComparator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest1 {
    @Test
    public void testFirstGreater() {
        assertEquals(NumberComparator.compare(5, 3), "5 > 3");
    }

    @Test
    public void testSecondGreater() {
        assertEquals(NumberComparator.compare(2, 4), "2 < 4");
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(NumberComparator.compare(7, 7), "7 == 7");
    }
}