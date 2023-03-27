package hackerrank.newyearchaos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewYearChaos {

    public static void main(String[] rgs) {
        Integer[] params = {5,1,2,3,7,8,6,4};
        minimumBribes(Arrays.asList(params));
    }

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;

        for (int i = q.size() - 1; i >= 0; i--) {

            int index = i + 1;
            int number = q.get(i);

            if (number != index) {

                if (i > 2 && q.get(i - 1) != index && q.get(i - 2) != index) {
                    System.out.println("Too chaotic");
                    bribes = 0;
                    break;
                } else {
                    if (q.get(i - 1) == index) {
                        bribes++;
                        Collections.swap(q, i, i - 1);
                    } else {
                        bribes += 2;
                        Collections.swap(q, i - 1, i - 2);
                        Collections.swap(q, i, i - 1);
                    }

                }

            }
        }
        if (bribes > 0) {
            System.out.println(bribes);
        }

    }
}