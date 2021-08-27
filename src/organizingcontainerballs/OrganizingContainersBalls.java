package organizingcontainerballs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrganizingContainersBalls {

    public static void main(String[] args) {
        Integer[][] arrayInteiros = {
                {999336263, 998799923},
                {998799923, 999763019}
        };

        System.out.println(organizingContainers(Arrays.stream(arrayInteiros)
                .map(Arrays::asList)
                .collect(Collectors.toList())));
    }

    public static String organizingContainers(List<List<Integer>> container) {
        List<Integer> totaisBolas = new ArrayList<>();
        List<Integer> totaisContainers = new ArrayList<>();

        for (int i = 0; i < container.get(0).size(); i++) {
            int somatorioBolas = 0;
            for (int j = 0; j < container.size(); j++) {
                somatorioBolas += container.get(j).get(i);
            }
            totaisBolas.add(somatorioBolas);
        }

        for (int i = 0; i < container.size(); i++) {
            int somatorioContainers = 0;
            for (int j = 0; j < container.get(0).size(); j++) {
                somatorioContainers += container.get(i).get(j);
            }
            totaisContainers.add(somatorioContainers);
        }

        for (Integer totalBola : totaisBolas) {
            for (int i = 0; i < totaisContainers.size(); i++) {
                if (totalBola.equals(totaisContainers.get(i))) {
                    totaisContainers.remove(i);
                    continue;
                }
            }
        }
        // Write your code here
        return totaisContainers.isEmpty() ? "Possible" : "Impossible";
    }

}
