package codesignal;

public class EvenDigitsOnly {

    boolean solution(int n) {
        String number = String.valueOf(n);

        for (char digit : number.toCharArray()) {

            if (Integer.valueOf(String.valueOf(digit)) % 2 != 0) {
                return false;
            }

        }
        return true;
    }
}
