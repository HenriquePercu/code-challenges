package codechef.starter37;

import java.util.Scanner;

public class MangoTruck {

    public static void main(String[] args) throws Exception {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(canCrossBridge(x,y,z));

        }

    }

    public static int canCrossBridge(int mangoWeight , int truckWeight, int bridgeWeight){
        return (bridgeWeight - truckWeight) / mangoWeight;
    }

}
