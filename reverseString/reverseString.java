package reverseString;

public class reverseString {

    public static String main(String in) {
        int length = in.length();
        char[] characters = in.toCharArray();
        char[] charOut = new char[length];

        for (int i = 0; i < length; i++) {
            charOut[i] = characters[length-1 - i];
        }

        return new String(charOut);
    }
}
