package codesignal;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-11/Zr2XXEpkBPtYWqPJu">Problem</a>
 */
public class IsDigit {

    boolean solution(char symbol) {

        if ((int) symbol > 47 && (int) symbol < 58) {
            return true;
        } else {
            return false;
        }
    }


}
