package validPalindrome;

import java.util.Locale;

public class ValidPalindrome {

    public static boolean run(String in) {
        in = in.toLowerCase(Locale.ENGLISH);

        int i = 0;
        int j = in.length() - 1;
        while(i < j) {
            char first = in.charAt(i);
            char second = in.charAt(j);

            while (!Character.isAlphabetic(first)) {
                i++;
                first = in.charAt(i);
            }
            while (!Character.isAlphabetic(second)) {
                j--;
                second = in.charAt(j);
            }

            if (first != second) {
                return false;
            }
            i++;
            j--;
        }
       return true;
    }
}
