package leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }

    //TODO instead manipulating a substring, it could be only two index iterating over a char[] marking the substring, so we dont need the lastImportantIndex.
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> lettersOnTheSubsequence = new HashMap<>();
        String longestSubstring = "";
        String validateSubstring = "";
        int lastImportanteIndex = 0;


        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (lettersOnTheSubsequence.get(character) == null || lettersOnTheSubsequence.get(character) < lastImportanteIndex) {
                lettersOnTheSubsequence.put(character, i);
                validateSubstring = validateSubstring.concat(String.valueOf(character));
            } else {
                if (i != s.length() - 1) {
                    lastImportanteIndex = lettersOnTheSubsequence.get(character) + 1;
                    validateSubstring = s.substring(lastImportanteIndex, i).concat(String.valueOf(character));
                    lettersOnTheSubsequence.put(character, i);
                }
            }

            if (longestSubstring.length() < validateSubstring.length()) {
                longestSubstring = validateSubstring;
            }
        }

        return longestSubstring.length();
    }

}
