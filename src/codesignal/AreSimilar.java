package codesignal;

import java.util.Arrays;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP">Problem</a>
 */
public class AreSimilar {

    /**
     * Strategy:
     * Counting how many difference are, then sort both array and see if they are equally (that is the only way to return true)
     * And also check if has more than three difference, if has 2, still is possible to solve just switching one time and solving both mismatchs
     * @param a
     * @param b
     * @return
     */
    boolean solution(int[] a, int[] b) {
        int differences = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                differences++;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b) && differences < 2;
    }

}
