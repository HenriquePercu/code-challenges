package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> existingNumbers = new HashMap<>(); // number , position

        for (int i = 0; i < nums.length; i++) {
            Integer index = existingNumbers.get(target - nums[i]);
            if(index != null){
                result[0] = i;
                result[1] = index;
                return result;
            }else{
                existingNumbers.put(nums[i], i);
            }

        }
        return result;
    }

    // other solutions

    // order the array and then do a two pointer

    // use a hashmap

}
