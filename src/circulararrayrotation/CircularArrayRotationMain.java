import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotationMain {

    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.addAll(Arrays.asList(1, 2, 3));
        circularArrayRotation(newList, 2, Arrays.asList(0, 1, 2));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> posicoesArray = new ArrayList<>();
        int tamanhoArray = a.size();

        //for para executar os passos do array circular
        for (int i = 0; i < k; i++) {
            int lastValue = a.remove(tamanhoArray - 1);
            a.add(0, lastValue);
        }

        for (Integer numberToFindIndex : queries) {
            posicoesArray.add(posicoesArray.size(), a.get(numberToFindIndex));
        }

        return posicoesArray;
    }

}
