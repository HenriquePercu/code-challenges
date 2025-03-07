package neetcode;

import java.util.HashSet;
import java.util.Set;

public class HasDuplicate {

    public boolean hasDuplicate(int[] nums) {

        Set<Integer> elements = new HashSet<>();

        for (int num : nums) {

            if (elements.contains(num)) {
                return true;
            } else {
                elements.add(num);
            }
        }

        return false;
    }

}
