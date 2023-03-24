package hackerrank.arrayleftrotation;

import java.util.List;

public class ArrayLeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> firstSlice = a.subList(d, a.size());
        List<Integer> lastSlice = a.subList(0, d);

        firstSlice.addAll(lastSlice);

        return firstSlice;
    }

}
