package codechef.longcontestmayone;

import java.util.Scanner;

public class SugarCaneJuiceBusiness {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int glassesSold = sc.nextInt();

            System.out.println(calculateProfit(glassesSold));
        }

    }

    private static int calculateProfit(int glassesSold){
        int totalIncome = glassesSold * 50;

        return totalIncome - (totalIncome*20/100) - (totalIncome*20/100) - (totalIncome*30/100);

    }

}
