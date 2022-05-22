package codechef.longcontestmayone;

import java.util.Scanner;

public class FootballCup {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int scoreX = sc.nextInt();
            int scoreY = sc.nextInt();

            System.out.println(likeMatch(scoreX, scoreY));
        }

    }

    private static String likeMatch(int scoreX, int scoreY) {
        return (scoreX == scoreY) && (scoreX > 0 || scoreY > 0) ? "YES" : "NO";
    }

}
