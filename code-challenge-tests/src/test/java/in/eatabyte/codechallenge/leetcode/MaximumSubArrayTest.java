package in.eatabyte.codechallenge.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubArrayTest {

    private static final MaximumSubArray instance = new MaximumSubArray();

    @Test
    public void test1() {
        int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int expected = 6;
        assertEquals(expected, instance.maxSubArray_bruteforce(input));
    }

    @Test
    public void test2() {
        int[] input = { 1 };
        int expected = 1;
        assertEquals(expected, instance.maxSubArray_bruteforce(input));
    }

    @Test
    public void test3() {
        int[] input = { 5, 4, -1, 7, 8 };
        int expected = 23;
        assertEquals(expected, instance.maxSubArray_bruteforce(input));
    }

}