package neetcode;

import java.util.HashMap;

public class TwoIntSum {

    public int[] twoSum(int[] nums, int target) {
        // HashMap<Difference, Index>
        HashMap<Integer, Integer> differenceMap = new HashMap<>();
        int[] response = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer currentDifference = target - nums[i];
            Integer differenceIndex = differenceMap.get(nums[i]);

            if(differenceIndex != null){
                System.out.println("Found difference");
                response[0] = differenceIndex;
                response[1] = i;
                break;
            }else{
                System.out.println("Adding to map");
                differenceMap.put(currentDifference, i);
            }
        }

        return response;
    }

}
