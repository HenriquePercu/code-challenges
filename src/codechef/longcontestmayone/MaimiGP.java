package codechef.longcontestmayone;

import java.util.Scanner;

public class MaimiGP {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            double fastFinishTime = sc.nextDouble();
            double chefFinishTime = sc.nextDouble();

            System.out.println(canCompete(fastFinishTime, chefFinishTime));
        }

    }

    private static String canCompete(double fastFinishTime, double chefFinishTime){
        return chefFinishTime > fastFinishTime + (fastFinishTime*7/100) ? "NO" : "YES";
    }

}
