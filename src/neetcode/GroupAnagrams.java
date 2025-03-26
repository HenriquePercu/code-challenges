package neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // create a hashMap<String ordered, List<String>>
        List<List<String>> response = new ArrayList<List<String>>();
        HashMap<String, List<String>> anagramsMap = new HashMap();

        for(String word : strs) {

            char[] ar = word.toCharArray();
            Arrays.sort(ar);
            String sorted = String.valueOf(ar);
            List anagramsList = anagramsMap.getOrDefault(sorted, new ArrayList<String>());

            anagramsList.add(word);

            anagramsMap.put(sorted, anagramsList);
        }

        for (List<String> value : anagramsMap.values()) {
            response.add(value);
        }

        return response;

    }

}
