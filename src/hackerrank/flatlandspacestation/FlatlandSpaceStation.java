package hackerrank.flatlandspacestation;

import java.util.Arrays;

public class FlatlandSpaceStation {

    public static void main(String[] args) {
        int maximumDistance = flatlandSpaceStations(20, new int[]{13, 1, 11, 10, 6});

        System.out.println("Maximum Distance is " + maximumDistance);
    }


    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        //for each city, calculate the distance for space station
        Arrays.sort(c);
        int maximumDistance = 0;

        for (int i = 0; i < n; i++) {
            int distance = 0, distanceAhead = n, distanceBehind = n;

            // Find the position of n on c[] using binary search
            int insertionPoint = Arrays.binarySearch(c, i);

            //city has a space station
            if (insertionPoint >= 0) {
                continue;
            }

            // normalizing the position
            insertionPoint = (insertionPoint + 1) * -1;

            distanceAhead = getDistanceAhead(c, i, insertionPoint, n);
            distanceBehind = getDistanceBehind(c, i, insertionPoint, n);

            distance = Math.min(distanceAhead, distanceBehind);

            if (distance > maximumDistance) {
                maximumDistance = distance;
            }
        }

        return maximumDistance;
    }

    private static int getDistanceAhead(int[] c, int i, int insertionPoint, int n) {
        int distanceAhead = n;
        if (!(insertionPoint >= c.length)) {
            distanceAhead = (i - c[insertionPoint]) * -1;
        }
        return distanceAhead;
    }

    private static int getDistanceBehind(int[] c, int i, int insertionPoint, int n) {
        int distanceBehind = n;
        if (!(insertionPoint == 0)) {
            distanceBehind = (i - c[insertionPoint - 1]);
        }
        return distanceBehind;
    }


}
