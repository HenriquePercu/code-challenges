package codesignal;

public class AlphabeticShift {

    String solution(String inputString) {
        StringBuilder sb = new StringBuilder();
        for (char character : inputString.toCharArray()) {

            if (character == 'z') {
                sb.append("a");
            } else {
                int newChar = ((int) character + 1);
                sb.append((char) newChar);
            }

        }

        return sb.toString();
    }


}
