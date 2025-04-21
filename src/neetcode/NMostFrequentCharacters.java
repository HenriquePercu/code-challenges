package neetcode;

import java.util.*;

public class NMostFrequentCharacters {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> numberFrequencyMap = new HashMap();
        for(int num : nums){
            Integer frequencyNumber = numberFrequencyMap.getOrDefault(num, 0) + 1;

            numberFrequencyMap.put(num, frequencyNumber);
        }

        List<Map.Entry<Integer, Integer>> listOfFrequenciesAndId = new ArrayList<>(numberFrequencyMap.entrySet());
        listOfFrequenciesAndId.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int[] response = new int[k];

        for(int i = 0; i < k; i++){
            response[i] = listOfFrequenciesAndId.get(i).getKey();
        }

        return response;
    }

}
