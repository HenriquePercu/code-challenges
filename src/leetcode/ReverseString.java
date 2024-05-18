package leetcode;

public class ReverseString {
    public void reverseString(char[] s) {
        int end = s.length - 1;

        for (int begin = 0; begin < end; begin++, end--) {

            char temp = s[begin];
            s[begin] = s[end];
            s[end] = temp;
        }
    }

}
