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

        // if first is upper -> check second, if second is lower -> all rest all lower else all rest are upper
        if (isFirstUpper) {
            if (isSecondUpper) {
                // All chars should be upper
                return !isCharsNToEndLower(chars, 2, stringLength);

            } else {
                // all chars[2..] should be lower
                return isCharsNToEndLower(chars, 2, stringLength);
            }

        } else {
            // all others should be lower
            return isCharsNToEndLower(chars, 1, stringLength);
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
