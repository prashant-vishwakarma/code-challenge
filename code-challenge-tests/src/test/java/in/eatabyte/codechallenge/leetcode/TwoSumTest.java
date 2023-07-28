package in.eatabyte.codechallenge.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import in.eatabyte.codechallenge.leetcode.TwoSum;

public class TwoSumTest {

    private final TwoSum instance = new TwoSum();

    @Test
    public void test1() {
        int[] input = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, instance.twoSum(input, target));
    }

    @Test
    public void test2() {
        int[] input = { 3, 2, 4 };
        int target = 6;
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, instance.twoSum(input, target));
    }

    @Test
    public void test3() {
        int[] input = { 3, 3 };
        int target = 6;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, instance.twoSum(input, target));
    }

}