package codechef.starter80;

import java.util.Scanner;

public class SingleUse {

    public static void main(String[] args) throws Exception {
        double testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextDouble();

        for (double i = 0; i < testCases; i++) {
            int healthPoints = sc.nextInt();
            int normalAttack = sc.nextInt();
            int specialAttack = sc.nextInt();

            System.out.println(calculateMinimumAttacks(healthPoints, normalAttack, specialAttack));
        }

    }

    private static int calculateMinimumAttacks(double healthPoints, double normalAttack, double specialAttack) {
        healthPoints = healthPoints - specialAttack;// use the special attack
        int minimumAttacks = 1;

        if (healthPoints >= 0) {
            double normalAttacks = healthPoints / normalAttack;
            minimumAttacks += Math.ceil(normalAttacks);
        }
        //if it's still some hp, use normal attacks
        return minimumAttacks;
    }

}
