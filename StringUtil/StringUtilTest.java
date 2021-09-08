package StringUtil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void longestCommonPrefixWith_colorado_color_cold_Returns_col() {
        String[] words = {"colorado", "color", "cold"};

        String response = StringUtil.longestCommonPrefix(words);

        assertEquals("col", response);
    }

    @Test
    void longestCommonPrefixWith_a_b_c_Returns_EmptyString() {
        String[] words = {"a", "b", "c"};

        String response = StringUtil.longestCommonPrefix(words);

        assertEquals("", response);
    }

    @Test
    void longestCommonPrefixWith_spot_spotty_spotted_Returns_spot() {
        String[] words = {"spot", "spotty", "spotted"};

        String response = StringUtil.longestCommonPrefix(words);

        assertEquals("spot", response);
    }

}