package codechef.starter80;

import java.util.HashMap;
import java.util.Scanner;

public class EqualElements {

    public static void main(String[] args) throws Exception {
        double testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextDouble();

        for (double i = 0; i < testCases; i++) {
            int arraySize = sc.nextInt();
            int[] numbers = new int[arraySize];

            for (int number = 0; number < arraySize; number++) {
                numbers[number] = sc.nextInt();
            }

            System.out.println(calculateMinimumOperations(numbers));
        }

    }

    private static int calculateMinimumOperations(int[] numbers) {
        HashMap<Integer, Integer> numberApparitionsSummary = new HashMap<>();
        int numberMostApparitionTimes = 0;

        for (int number : numbers) {

            int numberApparitions = numberApparitionsSummary.getOrDefault(number, 0) + 1;
            numberApparitionsSummary.put(number, numberApparitions);

            if(numberApparitions > numberMostApparitionTimes){
                numberMostApparitionTimes++;
            }

        }

        return numbers.length - numberMostApparitionTimes;
    }

}
