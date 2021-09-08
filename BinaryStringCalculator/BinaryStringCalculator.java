package BinaryStringCalculator;

public class BinaryStringCalculator {
    public static String add(String numberOne, String numberTwo) {
        int numOneValue = binaryStringToInt(numberOne);
        int numTwoValue = binaryStringToInt(numberTwo);

        int answerValue = numOneValue + numTwoValue;

        return intToBinaryString(answerValue);
    }

    private static int binaryStringToInt(String binaryString) {
        int value = 0;
        int digits = binaryString.length();
        for (int i = digits - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                value += Math.pow(2, digits - 1 - i);
            }
        }
        return value;
    }

    private static String intToBinaryString(int answerValue) {
        if (answerValue < 0)
            throw new IllegalArgumentException("Int expected to be greater than 0");
        if (answerValue == 0)
            return "0";

        StringBuilder answer = new StringBuilder();

        int whole = answerValue;
        while (whole > 0) {
            int remainder = whole % 2;
            answer.insert(0, "" + remainder);

            whole = whole / 2;
        }
        return answer.toString();
    }
}
