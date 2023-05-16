package random;

import java.util.*;

public class TestDome {

    public static int nthLowestSelling(int[] sales, int n) {
        // criar um mapa com a frequencia, percorrer o map para ordernar
        HashMap<Integer, Integer> booksFrequency = new HashMap<>();

        for (int sale : sales) {
            Integer currentFrequency = booksFrequency.getOrDefault(sale, 0) + 1;

            booksFrequency.put(sale, currentFrequency);
        }

        // Cria uma list de entries / tuplas (BookId -> Frequency) e ordena pela frequency
        List<Map.Entry<Integer, Integer>> listOfFrequenciesAndId = new ArrayList<>(booksFrequency.entrySet());
        Collections.sort(listOfFrequenciesAndId, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        return listOfFrequenciesAndId.get(n - 1).getKey();
    }

    public static void main(String[] args) {
        int x = nthLowestSelling(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5, 5, 4, 3, 2, 2, 2}, 2);
        System.out.println(x);
    }

}
