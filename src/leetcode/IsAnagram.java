package leetcode;

import java.util.Arrays;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        s = new String(tempArray);

        char tempArrayT[] = t.toCharArray();
        Arrays.sort(tempArrayT);
        t = new String(tempArrayT);

        return s.equals(t);
    }

}
