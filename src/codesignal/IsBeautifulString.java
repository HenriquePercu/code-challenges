package codesignal;

import java.util.HashMap;
import java.util.Map;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-9/hoLtYWbjdrD2PF6yo">Problem</a>
 */
public class IsBeautifulString {

    public static void main(String[] args){
        solution("bbbaacdafe");
    }

    static boolean solution(String inputString) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (char character : inputString.toCharArray()) {

            int currentValue = frequencyMap.getOrDefault((int) character, 0);
            frequencyMap.put((int) character, ++currentValue);

        }

        for (Map.Entry<Integer, Integer> keys : frequencyMap.entrySet()) {

            if (keys.getKey() == 97) { // a
                continue;
            }

            int previousValue = frequencyMap.getOrDefault(keys.getKey() - 1, -1);

            if (previousValue < keys.getValue()) {
                return false;
            }

        }
        return true;
    }
}
