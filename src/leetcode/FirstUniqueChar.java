package leetcode;

import java.util.HashMap;

public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> characterFrequency = new HashMap<>();

        for (Character character : s.toCharArray()) {
            Integer frequency = characterFrequency.getOrDefault(character, 0) + 1;
            characterFrequency.put(character, frequency);
        }

        int i =0;
        for (Character character : s.toCharArray()) {
            if(characterFrequency.getOrDefault(character,0) <= 1){
                return i;
            }
            i++;
        }
        return -1;
    }

}
