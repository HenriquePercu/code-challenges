package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/sgDWKCFQHHi5D3Szj">Problem</a>
 */
public class ExtraNumber {

    int solution(int a, int b, int c) {

        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        return a;
    }
}
