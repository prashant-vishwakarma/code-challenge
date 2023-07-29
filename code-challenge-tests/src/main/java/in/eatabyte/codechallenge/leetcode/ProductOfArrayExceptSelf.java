package in.eatabyte.codechallenge.leetcode;

/**
 * LeetCode #238
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = (i > 0 ? result[i - 1] * nums[i - 1] : 1);
        }
        int product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product = i != nums.length - 1 ? nums[i + 1] * product : 1;
            result[i] *= product;
        }
        return result;
    }

    /*
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
    */

    /*
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = nums[i] * (i != 0 ? prefix[i - 1] : 1);
            int j = nums.length - i - 1;
            suffix[j] = nums[j] * (j != nums.length - 1 ? suffix[j + 1] : 1);
        }
        for (int i = 0; i < nums.length; i++) {
            int prefixPortion = (i != 0 ? prefix[i - 1] : 1);
            int postfixPortion = (i != nums.length - 1 ? suffix[i + 1] : 1);
            result[i] = prefixPortion * postfixPortion;
        }
        return result;
    }
    */
}
