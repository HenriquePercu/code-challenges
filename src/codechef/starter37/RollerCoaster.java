package codechef.starter37;

import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) throws Exception {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(canEnterRollerCoaster(x,y));

        }

    }

    public static String canEnterRollerCoaster(int heightChef , int minimumHeight){
        return heightChef < minimumHeight ? "NO" : "YES";
    }

}
