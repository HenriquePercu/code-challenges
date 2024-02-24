package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-11/vpfeqDwGZSzYNm2uX">Problem</a>
 */

public class DeleteDigit {

    int solution(int n) {

        String number = String.valueOf(n);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length() - 1; i++) {
            int currentNumber = Integer.parseInt(String.valueOf(number.charAt(i)));
            int nextNumber = Integer.parseInt(String.valueOf(number.charAt(i + 1)));

            if (currentNumber < nextNumber) {
                sb.append(number.substring(i + 1));
                break;
            } else {
                sb.append(currentNumber);
            }

        }
        return Integer.parseInt(sb.toString());
    }


}
