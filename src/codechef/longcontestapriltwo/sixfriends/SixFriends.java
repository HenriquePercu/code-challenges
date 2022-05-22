package codechef.longcontestapriltwo.sixfriends;

import java.util.Scanner;

public class SixFriends {

    public static void main(String[] args) throws Exception {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(minimumAmmount(x,y));

        }

    }

    private static int minimumAmmount(int x, int y){
        // calcula 3 double room
        int doubleRoomCost = 3 * x;
        int tripleRoomCost = 2 * y;

        return Math.min(doubleRoomCost, tripleRoomCost);
    }

}
