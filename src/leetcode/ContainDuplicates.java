package leetcode;

import java.util.HashMap;

public class ContainDuplicates {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> existingNumbers = new HashMap<Integer, Boolean>();

        for (int number : nums) {
            Boolean exists = existingNumbers.get(number);
            if (exists!= null && exists) {
                return true;
            } else {
                existingNumbers.put(number, Boolean.TRUE);
            }

        }
        return false;
    }

}
