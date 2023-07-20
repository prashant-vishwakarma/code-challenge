package in.eatabyte.codechallenge.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            Integer m = map.get(diff);
            if (null != m && target == m) {
                return new int[] { i, m };
            } else {
                map.put(num, i);
            }
        }
        return new int[2];
    }


}
