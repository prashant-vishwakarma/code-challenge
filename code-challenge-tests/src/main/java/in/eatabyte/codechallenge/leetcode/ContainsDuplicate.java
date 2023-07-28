package in.eatabyte.codechallenge.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #217
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int current : nums) {
            if (!numbers.contains(current)) {
                numbers.add(current);
            } else {
                return true;
            }
        }
        return false;
    }

}
