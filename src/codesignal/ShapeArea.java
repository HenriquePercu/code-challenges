package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ">...</a>
 */
public class ShapeArea {
    static int solution(int n) {
        if (n == 1) {
            return 1;
        }
        int result = (n * 2) - 1; // calculate middle column

        for (int i = (n * 2) - 3; i > 0; i = i - 2) {
            result += (i * 2); // calculate each of column (right and left)
        }

        return result;
    }


}
