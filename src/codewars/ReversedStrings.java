package codewars;

public class ReversedStrings {

    public static void main(String[] args) {
        System.out.println(solution(" "));
    }

    public static String solution(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return str.charAt(str.length() - 1) + solution(str.substring(0,str.length() - 1));
    }

}
