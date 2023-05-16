package codesignal;

import java.util.Arrays;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC">Problem</a>
 */
public class MakeArrayConsecutive2 {

    int solution(int[] statues) {
        Arrays.sort(statues);
        int difference = 0;

        for (int i = 0; i < statues.length - 1; i++) {

            if (statues[i + 1] - statues[i] > 1) {
                difference += statues[i + 1] - statues[i] - 1;
            }

        }
        return difference;

    }

}
