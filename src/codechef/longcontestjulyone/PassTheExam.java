package codechef.longcontestjulyone;

import java.util.Scanner;

public class PassTheExam {

    public static void main(String[] args){
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int scoreA = sc.nextInt();
            int scoreB = sc.nextInt();
            int scoreC = sc.nextInt();

            System.out.println(passExam(scoreA, scoreB, scoreC));
        }
    }

    public static String passExam(int scoreA, int scoreB, int scoreC){
        return checkTotalScore(scoreA, scoreB, scoreC) && checkMininumScore(scoreA, scoreB, scoreC) ? "PASS" : "FAIL";
    }

    private static boolean checkTotalScore(int scoreA, int scoreB, int scoreC){
        return (scoreA + scoreB + scoreC) >= 100;
    }

    private static boolean checkMininumScore(int scoreA, int scoreB, int scoreC){
        return scoreA >= 10 && scoreB >= 10 && scoreC >= 10;
    }

}
