package in.eatabyte.codechallenge.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            Integer m = map.get(num);
            if (null != m) {
                return new int[] { m, i };
            } else {
                map.put(diff, i);
            }
        }
        return new int[2];
    }


}
