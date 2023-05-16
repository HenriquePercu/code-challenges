package codesignal;

import java.util.Arrays;
import java.util.List;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM/">Problem</a>
 */
public class SortByHeight {

    int[] solution(int[] a) {

        List<Integer> onlyHumans = Arrays.stream(a)
                .boxed()
                .filter(integer -> integer != -1)
                .sorted()
                .toList();

        int currentHuman = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != -1) {

                a[i] = onlyHumans.get(currentHuman);
                currentHuman++;
            }

        }
        return a;
    }


}
