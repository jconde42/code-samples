package validPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void ValidPalindromeWithLowerCaseLevelReturnsTrue() {
        String in = "level";

        boolean result = ValidPalindrome.run(in);

        assertTrue(result);
    }

    @Test
    void ValidPalindromeWithAlgorithmReturnsFalse() {
        String in = "Algorithm";

        boolean result = ValidPalindrome.run(in);

        assertFalse(result);
    }

    @Test
    void ValidPalindromeWithLevelReturnsTrue() {
        String in = "Level";

        boolean result = ValidPalindrome.run(in);

        assertTrue(result);
    }

    @Test
    void ValidPalindromeWithNonAlphabeticReturnsTrue() {
        String in = "A man, a plan, a canal: Panama.";

        boolean result = ValidPalindrome.run(in);

        assertTrue(result);
    }
}