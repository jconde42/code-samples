package correctCapitalization;

public class correctCapitalization {
    public static boolean run(String in) {
        char[] chars = in.toCharArray();
        int stringLength = in.length();

        if (stringLength <= 1)
            return true;

        boolean isFirstUpper = Character.isUpperCase(chars[0]);
        boolean isSecondUpper = Character.isUpperCase(chars[1]);

        if (stringLength == 2) {
            return (isFirstUpper || !isSecondUpper);
        }

        if (!isFirstUpper && isSecondUpper) // Short Circuit
            return false;

        if (isFirstUpper && isSecondUpper) {
            return !isCharsNToEndLower(chars, 2, stringLength);  // All capitalized
        } else {
            return isCharsNToEndLower(chars, 1, stringLength); // chars[1..end] should be lower
        }
    }

    private static boolean isCharsNToEndLower(char[] chars, int n, int stringLength) {
        for (int i = n; i < stringLength; i++) {
            if (Character.isUpperCase(chars[i])) {
                return false;
            }
        }
        return true;
    }
}
