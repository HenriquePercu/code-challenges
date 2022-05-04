package codechef.codechef_longcontestapriltwo.sastasharktank;

import java.util.Scanner;

public class SastaSharkTank {

    public static void main(String[] args){
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(maximumValuation(x,y));

        }
    }

    private static String maximumValuation(int x , int y){
        // calcula o valor total de x
        double valorTotalX = x * 10;
        //calcula o valor total de y
        double valorTotalY = (100*y)/20;

        return valorTotalX > valorTotalY ? "FIRST" : valorTotalX < valorTotalY ? "SECOND" : "ANY";
    }

}
