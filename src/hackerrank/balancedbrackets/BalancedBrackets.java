package hackerrank.balancedbrackets;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("{[(])}"));
    }


    public static String isBalanced(String s) {
        if (s.length() % 2 != 0) {
            return "NO";
        }

        Stack<Character> pileCharacters = new Stack<>();

        for (char character : s.toCharArray()) {

            if (character == '(') {
                pileCharacters.push(')');
            } else if (character == '[') {
                pileCharacters.push(']');
            } else if (character == '{') {
                pileCharacters.push('}');
            } else if (pileCharacters.isEmpty() || pileCharacters.pop() != character) {
                return "NO";
            }

        }

        return pileCharacters.isEmpty() ? "YES" : "NO";
    }


}
