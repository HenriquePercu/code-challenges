package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/code-arcade/intro-gates/HEsmEacHr2s9wahjr">Problem</a>
 */
public class MaxMultiple {

    int solution(int divisor, int bound) {

        int largestInteger = divisor;

        while (largestInteger <= bound) {
            if (largestInteger + divisor > bound) {
                break;
            } else {
                largestInteger = largestInteger + divisor;
            }
        }

        return largestInteger;
    }


}
