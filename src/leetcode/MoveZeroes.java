package leetcode;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int counter = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                counter++;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = nums.length - 1; counter > 0; counter--, i--) {
            nums[i] = 0;
        }
    }





}
