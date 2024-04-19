package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{1, 2}, 5);
    }

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        List<Integer> firstSlice = new java.util.ArrayList<>(Arrays.stream(nums, nums.length - k, nums.length).boxed().toList());
        List<Integer> secondSlice = Arrays.stream(nums, 0, nums.length - k).boxed().toList();

        firstSlice.addAll(secondSlice);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = firstSlice.get(i);
        }
    }

}
