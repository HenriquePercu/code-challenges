package codesignal;

import java.util.Arrays;
import java.util.HashSet;

public class AvoidObstacles {


    static int solution(int[] inputArray) {
        Arrays.sort(inputArray);

        int maximumAdjacents = 0;
        int currentAdjacents = 0;
        HashSet<Integer> obstacles = new HashSet<>();
        obstacles.add(inputArray[0]);
        for (int i = 1; i < inputArray.length; i++) {
            obstacles.add(inputArray[i]);
            if (inputArray[i] - inputArray[i - 1] == 1) {
                currentAdjacents++;
            } else {
                currentAdjacents = 0;
            }

            if (currentAdjacents > maximumAdjacents) {
                maximumAdjacents = currentAdjacents;
            }
        }

        maximumAdjacents = maximumAdjacents == 0 ? 1 : maximumAdjacents;
        int response = inputArray[inputArray.length - 1] + 1;
        outer:
        for (int i = maximumAdjacents; i <= inputArray[inputArray.length - 1]; i++) {

            for (int j = 0; j < inputArray[inputArray.length - 1]; j++) {
                if (obstacles.contains(j * i)) {
                    continue outer;
                }
            }

            response = i;
            break;
        }

        return response;
    }


}
