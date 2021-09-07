package correctCapitalization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class correctCapitalizationTest {

    @Test
    void isCorrectCapitalizeWithAllCapitalsReturnsTrue() {
        String in = "ABC";

        boolean out = correctCapitalization.run(in);

        assertTrue(out);
    }

    @Test
    void isCorrectCapitalizedWithNoCapitalsReturnsTrue() {
        String in = "abc";

        boolean out = correctCapitalization.run(in);

        assertTrue(out);
    }

    @Test
    void isCorrectCapitalizedWithCamelCaseReturnsFalse() {
        String in = "aBc";

        boolean out = correctCapitalization.run(in);

        assertFalse(out);
    }

    @Test
    void isCorrectCapitalizedWithSingleCharReturnsTrue() {
        String in = "A";

        boolean out = correctCapitalization.run(in);

        assertTrue(out);
    }

    @Test
    void isCorrectCapitalizedWithTwoUpperReturnsTrue() {
        String in = "AA";

        boolean out = correctCapitalization.run(in);

        assertTrue(out);
    }

    void isCorrectCapitalizedWithaBReturnsFalse() {
        String in = "aB";

        boolean out = correctCapitalization.run(in);

        assertFalse(out);
    }

    void isCorrectCapitalizedWithaBcReturnsFalse() {
        String in = "aBc";

        boolean out = correctCapitalization.run(in);

        assertFalse(out);
    }

    void isCorrectCapitalizedUSAReturnTrue() {
        String in = "USA";

        boolean out = correctCapitalization.run(in);

        assertTrue(out);
    }

    void isCorrectCapitalizedCalvinReturnTrue() {
        String in = "Calvin";

        boolean out = correctCapitalization.run(in);

        assertTrue(out);
    }

    void isCorrectCapitalizedcompUterReturnFalse() {
        String in = "compUter";

        boolean out = correctCapitalization.run(in);

        assertFalse(out);
    }
}