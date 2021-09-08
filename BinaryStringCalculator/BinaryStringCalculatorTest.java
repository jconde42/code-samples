package BinaryStringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringCalculatorTest {

    @Test
    void addWith0And1Returns1() {
        String result = BinaryStringCalculator.add("0", "1");

        assertEquals("1", result);
    }

    @Test
    void addWith10And1Returns11() {
        String result = BinaryStringCalculator.add("10", "1");

        assertEquals("11", result);

    }

    @Test
    void addWith100And1Returns101() {
        String result = BinaryStringCalculator.add("100", "1");

        assertEquals("101", result);

    }

    @Test
    void addWith11And1Returns100() {
        String result = BinaryStringCalculator.add("11", "1");

        assertEquals("100", result);

    }

    @Test
    void addWith0And0Returns0() {
        String result = BinaryStringCalculator.add("0", "0");

        assertEquals("0", result);

    }
}