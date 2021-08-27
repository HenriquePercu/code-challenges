package insertionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort1 {

    public static void main(String[] args) {

        insertionSort1(5, Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        int ultimoElemento = arr.get(arr.size() - 1);

        //percorre o array ate encontrar o elemento menor
        for (int i = arr.size() - 2; i >= 0; i--) {

            if (ultimoElemento < arr.get(i)) {
                // shift dos indices
                arr.set(i + 1, arr.get(i));
            } else {
                arr.set(i + 1, ultimoElemento);
                break;
            }
            printArray(arr);
            if (i == 0) {
                arr.set(0, ultimoElemento);
            }
        }

        printArray(arr);
    }

    private static void printArray(List<Integer> arr) {
        System.out.println(arr.toString().replace("[", "").replace("]", "").replace(",", ""));
    }

}
