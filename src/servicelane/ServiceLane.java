package servicelane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ServiceLane {

    public static void main(String[] args) {
        List<Integer> lanes = Arrays.asList(1, 2, 2, 2, 1);
        System.out.println(serviceLane(4,
                lanes,
                Arrays.asList(Arrays.asList(2, 3)
                        , Arrays.asList(1, 4)
                        , Arrays.asList(2, 4)
                        , Arrays.asList(2, 4)
                        , Arrays.asList(2, 3)
                ))
        );
    }

    public static List<Integer> serviceLane(int n, List<Integer> lane, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();

        for (List<Integer> caso : cases) {

            int min = Collections.min(lane.subList(caso.get(0), caso.get(1) + 1));
            result.add(min);
        }

        return result;
    }
}
