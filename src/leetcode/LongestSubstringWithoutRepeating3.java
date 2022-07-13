package leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        return findLongestSubstringRecursive(s);
    }

    private static int findLongestSubstringRecursive(String s) {
        String maximumSubstring = "";
        String validateSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (!validateSubstring.contains(String.valueOf(character))) {
                validateSubstring = validateSubstring.concat(String.valueOf(character));
            } else {
                validateSubstring = validateSubstring.substring(validateSubstring.indexOf(character) + 1).concat(String.valueOf(character));
            }

            if (validateSubstring.length() > maximumSubstring.length()) {
                maximumSubstring = validateSubstring;
            }

        }

        return maximumSubstring.length();
    }

}
