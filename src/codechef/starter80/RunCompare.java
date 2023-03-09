package codechef.starter80;

import java.util.Scanner;

public class RunCompare {

    public static void main(String[] args) throws Exception {
        double testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextDouble();

        for (double i = 0; i < testCases; i++) {
            int numberOfDays = sc.nextInt();
            double[] aliceRun = new double[numberOfDays];
            double[] bobRun = new double[numberOfDays];

            for (int aliceRuns = 0; aliceRuns < numberOfDays; aliceRuns++) {
                aliceRun[aliceRuns] = sc.nextDouble();
            }

            for (int bobRuns = 0; bobRuns < numberOfDays; bobRuns++) {
                bobRun[bobRuns] = sc.nextDouble();
            }
            System.out.println(calculateHappiness(aliceRun, bobRun));
        }

    }

    private static int calculateHappiness(double[] aliceRun, double[] bobRun) {
        int quantityBothHappy = 0;
        //itera sobre o array, e verifica se está entre coeficiente
        for (int i = 0; i < aliceRun.length; i++) {
            double coefficient = aliceRun[i] / bobRun[i];

            if (coefficient <= 2 && coefficient >= 0.5) {
                quantityBothHappy++;
            }
        }

        return quantityBothHappy;
    }

}
