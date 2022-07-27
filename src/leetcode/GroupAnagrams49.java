package leetcode;

import java.util.*;

public class GroupAnagrams49 {

    public static void main(String[] args){
        String[] words = {"eat","tea", "tan", "ate", "bat", "nat"};
        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        // create a hashmap to store anagram and position of array
        Map<String, Integer> anagramsToPosition = new HashMap<>();

        for (String word : strs) {
            char[] tempArray = word.toCharArray();
            Arrays.sort(tempArray);

            String wordOrdered = new String(tempArray);

            Integer indexPosition = anagramsToPosition.get(wordOrdered);
            if (indexPosition != null) {
                result.get(indexPosition).add(word);
            } else {
                //insert new position on hashmap and insert on result
                result.add(new ArrayList<>());
                result.get(result.size() - 1).add(word);
                anagramsToPosition.put(wordOrdered, result.size() - 1);
            }

        }

        return result;
    }

}
