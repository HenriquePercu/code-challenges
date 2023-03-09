package codewars;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> diffList = new ArrayList<>();

        outer:
        for (int originalArrayNumber : a) {

            for (int numberToRemove : b) {
                if (originalArrayNumber == numberToRemove) {
                    continue outer;
                }
            }
            diffList.add(originalArrayNumber);
        }

        return diffList.stream().mapToInt(Integer::intValue).toArray();
    }


}


public class ArrayDiff {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{2}, Kata.arrayDiff(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, Kata.arrayDiff(new int[]{}, new int[]{1, 2}));
    }

}