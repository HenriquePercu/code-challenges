package codechef.longcontestjulyone;

import java.util.Scanner;

public class Bidding {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int biddingAlice = sc.nextInt();
            int biddingBob = sc.nextInt();
            int biddingCharlie = sc.nextInt();

            System.out.println(bidding(biddingAlice, biddingBob, biddingCharlie));
        }
    }

    public static String bidding(int biddingAlice, int biddingBob, int biddingCharlie) {
        String returnOwnerBidding = "";

        if (biddingAlice > biddingBob && biddingAlice > biddingCharlie) {
            returnOwnerBidding = "ALICE";
        } else if (biddingBob > biddingAlice && biddingBob > biddingCharlie) {
            returnOwnerBidding = "BOB";
        } else {
            returnOwnerBidding = "CHARLIE";
        }

        return returnOwnerBidding;
    }

}
