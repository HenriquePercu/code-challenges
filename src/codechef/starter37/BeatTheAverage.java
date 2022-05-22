package codechef.starter37;

import java.util.Scanner;

public class BeatTheAverage {

    public static void main(String[] args) throws Exception {
        double testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextDouble();

        for (double i = 0; i < testCases; i++) {
            double numbersStudent = sc.nextDouble();
            double maximumScore = sc.nextDouble();
            double averageScore = sc.nextDouble();

            System.out.println(maximumGradeA(numbersStudent, maximumScore, averageScore));

        }

    }

    private static int maximumGradeA(double numbersStudent, double maximumScore, double averageScore) {
        if (maximumScore == averageScore) return 0;

        double scorePossible = averageScore * numbersStudent;

        double maximumGrade = Math.floor(scorePossible / (averageScore + 1));

        if (maximumGrade == 0.0) {
            maximumGrade = 1;
        }

        return (int) maximumGrade;
    }

}
