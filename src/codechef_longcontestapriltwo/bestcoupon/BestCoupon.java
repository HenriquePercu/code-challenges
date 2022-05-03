package codechef_longcontestapriltwo.bestcoupon;

import java.util.Scanner;

public class BestCoupon {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int bill = sc.nextInt();

            System.out.println(maximumDiscount(bill));
        }

    }

    private static int maximumDiscount(int bill){
        //calculate percent discount
        int percent = (bill*10)/100;

        //calculate flat discount
        int flat = 100;

        return Math.max(percent, flat);
    }

}
