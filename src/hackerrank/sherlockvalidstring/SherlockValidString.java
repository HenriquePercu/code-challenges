package hackerrank.sherlockvalidstring;

import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {

    public static String isValid(String s) {
        HashMap<String, Integer> charactersFrequency = new HashMap<>();
        HashMap<Integer, Integer> countCharactersFrequency = new HashMap<>();
        int commonFrequency = 0;
        int countCommonFrequency = 0;

        for (char character : s.toCharArray()) {
            String letter = String.valueOf(character);
            int currentFrequency = charactersFrequency.getOrDefault(letter, 0) + 1;

            charactersFrequency.put(letter, currentFrequency);

        }

        for (Map.Entry<String, Integer> frequency : charactersFrequency.entrySet()) {

            int currentCountFrequency = countCharactersFrequency.getOrDefault(frequency.getValue(), 0) + 1;
            countCharactersFrequency.put(frequency.getValue(), currentCountFrequency);

            if (currentCountFrequency > countCommonFrequency) {
                countCommonFrequency = currentCountFrequency;
                commonFrequency = frequency.getValue();
            }

        }

        boolean canRemoveLetter = true;

        for (Map.Entry<String, Integer> frequency : charactersFrequency.entrySet()) {
            if (frequency.getValue() - commonFrequency == 0) {
                continue;
            }

            if (frequency.getValue() != 1 && (frequency.getValue() - commonFrequency < -1 || frequency.getValue() - commonFrequency > 1)) {
                return "NO";
            }

            if (canRemoveLetter) {
                canRemoveLetter = false;
            } else {
                return "NO";
            }
        }

        //System.out.println(frequency.getKey() + ":" + frequency.getValue());
        return "YES";
    }

}
