package in.eatabyte.codechallenge.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainsDuplicateTest {
    private static final ContainsDuplicate instance = new ContainsDuplicate();

    @Test
    public void test1() {
        int[] input = { 1, 2, 3, 1 };
        boolean expected = true;
        assertEquals(expected, instance.containsDuplicate(input));
    }

    @Test
    public void test2() {
        int[] input = { 1, 2, 3, 4 };
        boolean expected = false;
        assertEquals(expected, instance.containsDuplicate(input));
    }

    @Test
    public void test3() {
        int[] input = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean expected = true;
        assertEquals(expected, instance.containsDuplicate(input));
    }

}