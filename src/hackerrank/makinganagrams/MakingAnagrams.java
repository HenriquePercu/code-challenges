package hackerrank.makinganagrams;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    public static void main(String[] args) {
        System.out.println(makeAnagram("cde", "abc"));
    }

    public static int makeAnagram(String a, String b) {
        int removedNumbers = 0;
        //se eu fizer um hashmap com as frequencias de cada um das strings, percorrer os dois hashmaps e ver qual deles

        HashMap<Character, Integer> statisticsA = getFrequencyMap(a);
        HashMap<Character, Integer> statisticsB = getFrequencyMap(b);

        for (Map.Entry<Character, Integer> keys : statisticsA.entrySet()) {
            Integer frequencyInB = statisticsB.get(keys.getKey());

            if (frequencyInB != null) {
                removedNumbers += Math.abs(keys.getValue() - frequencyInB);
            } else {
                removedNumbers += keys.getValue();
            }

        }

        for (Map.Entry<Character, Integer> keys : statisticsB.entrySet()) {
            Integer frequencyInA = statisticsA.get(keys.getKey());

            if (frequencyInA == null) {
                removedNumbers += keys.getValue();
            }
        }

        return removedNumbers;
    }

    private static HashMap<Character, Integer> getFrequencyMap(String word) {
        HashMap<Character, Integer> statistics = new HashMap<>();

        for (char character : word.toCharArray()) {
            int frequency = statistics.getOrDefault(character, 0) + 1;
            statistics.put(character, frequency);
        }

        return statistics;
    }

}
