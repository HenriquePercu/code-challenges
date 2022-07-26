package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RamsomNote383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("asa", "aaa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        //create two hashMaps to store frequency of words
        Map<Character, Integer> ransomNoteFrquency = createFrquencyMap(ransomNote);
        Map<Character, Integer> magazineFrequency = createFrquencyMap(magazine);

        //iterate over ramsomNoteFrquencyHashMap and look on magazineHAshMap to verify if has at least same quantity of words
        for (Map.Entry<Character, Integer> character : ransomNoteFrquency.entrySet()) {
            Integer frequencyMagaine = magazineFrequency.get(character.getKey());

            if (frequencyMagaine == null || frequencyMagaine < character.getValue()) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> createFrquencyMap(String word) {
        Map<Character, Integer> frequencyCharacters = new HashMap<Character, Integer>();

        for (char character : word.toCharArray()) {
            Integer frequency = frequencyCharacters.get(character);
            if (frequencyCharacters.get(character) == null) {
                frequencyCharacters.put(character, 1);
            } else {
                frequencyCharacters.put(character, ++frequency);
            }
        }

        return frequencyCharacters;
    }
}
