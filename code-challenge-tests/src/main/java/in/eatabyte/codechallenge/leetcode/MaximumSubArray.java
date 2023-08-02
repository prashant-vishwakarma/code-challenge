package in.eatabyte.codechallenge.leetcode;

/**
 * LeetCode #53
 */
public class MaximumSubArray {

    public int maxSubArray_bruteforce(int[] nums) {
        int[] prefix = new int[nums.length];
        int maxSum = 0;
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int rangeSum = i > 0 ? prefix[j] - prefix[i - 1] : prefix[j];
                if (maxSum < rangeSum) {
                    maxSum = rangeSum;
                }
            }
        }
        return maxSum;
    }

}
