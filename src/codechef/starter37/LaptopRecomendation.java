package codechef.starter37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LaptopRecomendation {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        HashMap<Integer, Integer> mapaValores = new HashMap<>();
        for (int i = 0; i < testCases; i++) {
            int arrayLenght = sc.nextInt();

            List<Integer> array = new ArrayList();

            //instancia o array
            for (int j = 0; j < arrayLenght; j++) {
                int value = sc.nextInt();
                mapaValores.merge(value, 1, Integer::sum);
            }

            System.out.println(lapTopRecomendation(mapaValores));
            mapaValores = new HashMap<>();
        }
    }

    private static String lapTopRecomendation(HashMap<Integer, Integer> recomendations) {
        int maxRecommeendations = 0;
        Integer laptopRecommended = 0;
        boolean isConfused = false;

        for (Integer recommendation : recomendations.keySet()) {
            if(recomendations.get(recommendation) > maxRecommeendations){
                maxRecommeendations = recomendations.get(recommendation);
                laptopRecommended = recommendation;
                isConfused = false;
            }else{
                if(recomendations.get(recommendation).equals(maxRecommeendations)){
                    isConfused = true;
                }
            }
        }
        return isConfused ? "CONFUSED" : laptopRecommended.toString();
    }

}
