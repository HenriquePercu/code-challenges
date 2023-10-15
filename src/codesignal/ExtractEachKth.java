package codesignal;

import java.util.ArrayList;

public class ExtractEachKth {

    static int[] solution(int[] inputArray, int k) {
        var responseFiltered = new ArrayList<Integer>();

        for (int i = 0; i < inputArray.length; i++) {

            if ((i + 1) % k != 0) {
                responseFiltered.add(inputArray[i]);
            }
        }

        return responseFiltered.stream().mapToInt(i -> i).toArray();
    }

}
