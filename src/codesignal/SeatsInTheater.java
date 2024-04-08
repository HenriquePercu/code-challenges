package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/code-arcade/intro-gates/bszFiQAog96G9CXKg">Problem</a>
 */
public class SeatsInTheater {

    int solution(int nCols, int nRows, int col, int row) {
        return (nCols - (col - 1)) * (nRows - row);
    }

}
