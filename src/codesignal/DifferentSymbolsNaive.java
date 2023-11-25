package codesignal;

import java.util.HashMap;

public class DifferentSymbolsNaive {

    int solution(String s) {

        HashMap<Character, Integer> charactersFrequency = new HashMap<>();
        int uniqueSymbols = 0;

        for (Character character : s.toCharArray()) {

            if(!charactersFrequency.containsKey(character)){
                uniqueSymbols++;
                charactersFrequency.put(character, 1);
            }

        }

        return uniqueSymbols;
    }

}
