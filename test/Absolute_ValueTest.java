import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Absolute_ValueTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = Absolute_Value.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = Absolute_Value.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = Absolute_Value.findAbsolute(number);
        assertEquals(expected, result);
    }

}