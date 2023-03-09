package codechef.starter80;

import java.util.Scanner;

public class PrefixPermutation {

    public static void main(String[] args) throws Exception {
        double testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextDouble();
        for (double i = 0; i < testCases; i++) {
            int permutationNumber = sc.nextInt();

            if (permutationNumber % 2 != 0) {
                System.out.println(-1);
            } else {
                for (int j = 1; j <= permutationNumber; j += 2) {
                    System.out.print((j + 1) + " " + j + " ");
                }
                System.out.println();
            }
        }
    }

}
