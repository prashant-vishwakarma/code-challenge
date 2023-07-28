package in.eatabyte.codechallenge.leetcode;

/**
 * LeetCode #238
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int nonZeroProduct = 1;
        int zeroCount = 0;
        for (int current : nums) {
            if (current == 0) {
                zeroCount++;
            } else {
                nonZeroProduct *= current;
            }
        }
        if (zeroCount != nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (zeroCount > 0 && nums[i] != 0) {
                    nums[i] = 0;
                } else if (zeroCount > 0 && nums[i] == 0) {
                    nums[i] = zeroCount > 1 ? 0 : nonZeroProduct;
                } else {
                    nums[i] = nonZeroProduct / nums[i];
                }
            }
        }
        return nums;
    }
}
