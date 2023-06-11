package codesignal;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {


    boolean solution(String inputString) {

        HashMap<Character, Integer> wordFrequency = new HashMap<Character, Integer>();

        for (char character : inputString.toCharArray()) {
            Integer frequency = wordFrequency.getOrDefault(character, 0) + 1;
            wordFrequency.put(character, frequency);
        }

        // iterate, if it`s odd return false
        boolean isPossibleAotherOdd = true;
        for (Map.Entry<Character, Integer> entrySet : wordFrequency.entrySet()) {
            if (entrySet.getValue() % 2 != 0) {

                if (isPossibleAotherOdd) {
                    isPossibleAotherOdd = false;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
