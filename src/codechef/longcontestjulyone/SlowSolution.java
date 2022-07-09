package codechef.longcontestjulyone;

import java.util.Scanner;

public class SlowSolution {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();

            System.out.println(findSlowSolution(maxT, maxN, sumN));
        }
    }

    public static int findSlowSolution(int maxT, int maxN, int sumN) {
        int numberIterations = 0;
        int currentN = 0;
        for (int i = 0; i < maxT; i++) {
            if(currentN <= sumN){
                if(currentN + maxN > sumN){
                    int iterations = (sumN - currentN) * (sumN - currentN);
                    numberIterations += iterations;
                    currentN += iterations;
                }else{
                    numberIterations += maxN * maxN;
                    currentN += maxN;
                }
            }
        }
        return numberIterations;
    }

}
