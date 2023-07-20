package in.eatabyte.codechallenge.contest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    private static final Palindrome palindrome = new Palindrome();

    @Test
    public void testInput1() {
        String input = "aabb";
        int expected = 1;
        Assert.assertEquals(expected, palindrome.canMakePalindrome(input));
    }

    @Test
    public void testInput2() {
        String input = "aecbb";
        int expected = 0;
        Assert.assertEquals(expected, palindrome.canMakePalindrome(input));
    }

}