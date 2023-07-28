package in.eatabyte.codechallenge.maxprofit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProfitTest {

    private static final MaxProfit instance = new MaxProfit();

    @Test
    public void test1() {
        int[] input = { 7, 1, 5, 3, 6, 4 };
        int expected = 5;
        assertEquals(expected, instance.maxProfit(input));
    }

    @Test
    public void test2() {
        int[] input = { 7, 6, 4, 3, 1 };
        int expected = 0;
        assertEquals(expected, instance.maxProfit(input));
    }

    @Test
    public void test3() {
        int[] input = { 2, 1 };
        int expected = 0;
        assertEquals(expected, instance.maxProfit(input));
    }

}

