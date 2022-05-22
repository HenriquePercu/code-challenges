package codechef.starter37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Infernos {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int arrayLenght = sc.nextInt();
            double damageInferno = sc.nextDouble();

            List<Double> array = new ArrayList();
            double maximumHp = 0;
            //instancia o array
            for (int j = 0; j < arrayLenght; j++) {
                Double value = sc.nextDouble();

                if (value > maximumHp) {
                    maximumHp = value;
                }

                array.add(value);
            }

            System.out.println(Math.min(minSecondsToKill(damageInferno, array), (int) maximumHp));

        }
    }

    private static int minSecondsToKill(double damageInferno, List<Double> enemiesHp) {
        int secondsToKillSingleTarget = 0;

        for (Double enemyHp : enemiesHp) {
            secondsToKillSingleTarget += (Math.ceil(enemyHp / damageInferno));
        }

        return secondsToKillSingleTarget;
    }

}

