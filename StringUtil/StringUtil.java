package StringUtil;

public class StringUtil {
    public static String longestCommonPrefix(String[] words) {
        int shortestLength = getLengthOfShortestWord(words);

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < shortestLength; i++) {
            char expectedChar = words[0].charAt(i);
            boolean isCharDiff = false;
            for (String word : words) {
                char actualChar = word.charAt(i);
                isCharDiff = actualChar != expectedChar;
                if (isCharDiff)
                    break;
            }

            if (!isCharDiff) {
                answer.append(expectedChar);
            } else {
                break;
            }
        }

        return answer.toString();
    }

    private static int getLengthOfShortestWord(String[] words) {
        int min = Integer.MAX_VALUE;
        for (String word: words) {
            min = Math.min(word.length(), min);
        }
        return min;
    }
}
