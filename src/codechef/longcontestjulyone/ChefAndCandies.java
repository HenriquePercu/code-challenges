package codechef.longcontestjulyone;

import java.util.Scanner;

public class ChefAndCandies {

    public static void main(String[] args){
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int childrenNumber = sc.nextInt();
            int numberCandies = sc.nextInt();

            System.out.println(determineNumberPackets(childrenNumber, numberCandies));
        }
    }

    private static int determineNumberPackets(double childrenNumber, double numberCandies){
        if(childrenNumber <= numberCandies){
            return 0;
        }
        return (int) Math.ceil((childrenNumber - numberCandies) / 4);
    }

}
