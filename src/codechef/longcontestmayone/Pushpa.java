package codechef.longcontestmayone;

import java.util.*;

public class Pushpa {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int arrayLenght = sc.nextInt();

            HashMap<Integer, Integer> posicoes = new HashMap<>();
            List<Integer> array = new ArrayList();

            //instancia o array
            for (int j = 0; j < arrayLenght; j++) {
                Integer value = sc.nextInt();

                if (posicoes.get(value) == null) {
                    posicoes.put(value, 1);
                } else {
                    posicoes.put(value, posicoes.get(value) + 1);
                }
                array.add(value);
            }
            Collections.sort(array);
            System.out.println(maximumHeight(posicoes));

        }
    }

    private static int maximumHeight(HashMap<Integer, Integer> towerHeight){
        int maximumHeight = 0;
        for(Integer key : towerHeight.keySet()){
            int possibleHeight = key + (towerHeight.get(key) -1);

            if(possibleHeight > maximumHeight){
                maximumHeight = possibleHeight;
            }
        }

        return maximumHeight;
    }

}
