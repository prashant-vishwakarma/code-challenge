package in.eatabyte.codechallenge.contest;

import org.junit.Assert;
import org.junit.Test;

public class RepeatingCharacterTest {

    private static final RepeatingCharacter repeatingCharacter = new RepeatingCharacter();

    @Test
    public void testInput1() {
        String input = "adbcb";
        String expected = "b";
        Assert.assertEquals(expected, repeatingCharacter.firstRepeatingLetter(input));
    }

    @Test
    public void testInput2() {
        String input = "cgcg";
        String expected = "c";
        Assert.assertEquals(expected, repeatingCharacter.firstRepeatingLetter(input));
    }

}