package hackerrank.twodarrayds;

import java.util.List;

public class TwoDArrayDS {

    public static int hourglassSum(List<List<Integer>> arr) {
        int maximumResponse = Integer.MIN_VALUE;

        for (int i = 1; i < arr.size() - 1; i++) {

            for (int j = 1; j < arr.get(i).size() - 1; j++) {

                int middlePosition = arr.get(i).get(j);

                List<Integer> upRow = arr.get(i - 1);
                int upPosition = upRow.get(j - 1) + upRow.get(j) + upRow.get(j + 1);

                List<Integer> downRow = arr.get(i + 1);
                int downPosition = downRow.get(j - 1) + downRow.get(j) + downRow.get(j + 1);

                int currentlyHourGlass = middlePosition + upPosition + downPosition;

                if (currentlyHourGlass > maximumResponse) {
                    maximumResponse = currentlyHourGlass;
                }

                System.out.println(currentlyHourGlass);

            }

        }

        return maximumResponse;
    }

}
