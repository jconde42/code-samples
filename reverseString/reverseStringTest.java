package reverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class reverseStringTest {

    @Test
    void reverseStringWithCatReturnstaC(){
        String in = "Cat";
        String expected = "taC";
        assertEquals(expected, reverseString.main(in));
    }

    @Test
    void reverseStringWithThe_Daily_ByteReturnsetyB_yliaD_eht() {
        String in = "The Daily Byte";
        String expected = "etyB yliaD ehT";
        assertEquals(expected, reverseString.main(in));
    }

    @Test
    void reverseStringWithcivicReturnscivic() {
        String in = "civic";
        String expected = "civic";
        assertEquals(expected, reverseString.main(in));
    }

}