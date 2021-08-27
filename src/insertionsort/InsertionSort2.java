package insertionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertionSort2 {

    public static void main(String[] args) {
        insertionSort2(5, Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
    }

    public static void insertionSort2(int n, List<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {
            int elementoOrdenar = arr.get(i);
            for (int j = i - 1; j >= 0; j--) {

                if (elementoOrdenar > arr.get(j)) {
                    arr.set(j + 1, elementoOrdenar);
                    break;
                } else {
                    arr.set(j + 1, arr.get(j));
                }
                if (j == 0) {
                    arr.set(0, elementoOrdenar);
                }
            }
            printArray(arr);
        }

    }

    private static void printArray(List<Integer> arr) {
        System.out.println(arr.toString().replace("[", "").replace("]", "").replace(",", ""));
    }

}
