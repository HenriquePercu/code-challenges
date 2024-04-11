package leetcode;

public class RemoveDuplicatesInPlace727 {

    public int removeDuplicates(int[] nums) {

        int indexUnique = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]){
                continue;
            }else{
                nums[indexUnique] = nums[i];
                indexUnique++;
            }
        }

        return indexUnique;
    }

}
