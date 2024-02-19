package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-11/o2uq6eTuvk7atGadR">Problem</a>
 */
public class LineEncoding {

    String solution(String s) {
        Character currentChar = s.charAt(0);
        int qtdCurrentChar = 1;

        StringBuilder solution = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {

            Character newChar = s.charAt(i);

            if (newChar.equals(currentChar)) {
                qtdCurrentChar++;
            } else {
                if (qtdCurrentChar > 1) {
                    solution.append(qtdCurrentChar);
                }
                solution.append(currentChar);
                qtdCurrentChar = 1;
                currentChar = newChar;
            }

        }

        if (qtdCurrentChar > 1) {
            solution.append(qtdCurrentChar);
        }
        solution.append(currentChar);

        return solution.toString();
    }


}
