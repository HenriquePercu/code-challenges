package leetcode;

import java.util.Locale;

public class ValidPalindrome121 {

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("abba"));
    }

    public static boolean isValidPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);

        char[] characters = word.toCharArray();

        for (int i = 0, j = characters.length - 1; i < characters.length / 2; i++, j--) {

            if (characters[i] != characters[j]) {
                return false;
            }
        }
        return true;
    }

}
