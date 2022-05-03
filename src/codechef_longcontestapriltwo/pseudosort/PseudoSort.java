package codechef_longcontestapriltwo.pseudosort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PseudoSort {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int arrayLenght = sc.nextInt();

            List<Double> array = new ArrayList();

            //instancia o array
            for (int j = 0; j < arrayLenght; j++) {
                double value = sc.nextDouble();

                array.add(value);
            }

            System.out.println(checkPseudoSort(array));

        }
    }

    private static String checkPseudoSort(List<Double> arrayToSort) {
        //System.out.println(arrayToSort);
        boolean possuiTentativas = true;

        Double[] arrayConvertido = arrayToSort.toArray(new Double[arrayToSort.size()]);

        for (int i = 0; i < arrayConvertido.length - 1; i++) {
            if (arrayConvertido[i] > arrayConvertido[i + 1]) {
                if (!possuiTentativas) {
                    return "NO";
                }

                double aux = arrayConvertido[i];
                arrayConvertido[i] = arrayConvertido[i + 1];
                arrayConvertido[i + 1] = aux;

                // try to swap
                possuiTentativas = false;
                i = -1;
            }
            System.out.println(Arrays.toString(arrayConvertido));
        }

        return "YES";

    }

}
