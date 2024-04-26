package leetcode;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        boolean isEqualToNext = false;
        int response = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums.length - 1 == i) {
                response = nums[i];
                break;
            }

            if (nums[i + 1] != nums[i]) {
                if (!isEqualToNext) {
                    response = nums[i];
                    break;
                }
                isEqualToNext = false;
            } else {
                isEqualToNext = true;
            }

        }
        return response;
    }

}
