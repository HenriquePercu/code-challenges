package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram242 {

    public static void main(String[] args){
        System.out.println(isAnagram("abcde", "abdec"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        return new String(firstString).equals(new String(secondString));
    }


}
