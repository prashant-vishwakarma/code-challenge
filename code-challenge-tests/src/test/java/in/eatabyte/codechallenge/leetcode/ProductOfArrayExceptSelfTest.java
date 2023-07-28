package in.eatabyte.codechallenge.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf instance = new ProductOfArrayExceptSelf();

    @Test
    public void test1() {
        int[] input = { 1, 2, 3, 4 };
        int[] expected = { 24, 12, 8, 6 };
        assertArrayEquals(expected, instance.productExceptSelf(input));
    }

    @Test
    public void test2() {
        int[] input = { -1, 1, 0, -3, 3 };
        int[] expected = { 0, 0, 9, 0, 0 };
        assertArrayEquals(expected, instance.productExceptSelf(input));
    }

    @Test
    public void test3() {
        int[] input = { 0, 0 };
        int[] expected = { 0, 0 };
        assertArrayEquals(expected, instance.productExceptSelf(input));
    }

    @Test
    public void test4() {
        int[] input = { 0, 4, 0 };
        int[] expected = { 0, 0, 0 };
        assertArrayEquals(expected, instance.productExceptSelf(input));
    }

}