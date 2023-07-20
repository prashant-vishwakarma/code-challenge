package in.eatabyte.codechallenge.contest;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacter {

    public String firstRepeatingLetter(String input) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : input.toCharArray()) {
            int newCount = counts.getOrDefault(c, 0) + 1;
            if (newCount > 1) {
                return String.valueOf(c);
            } else {
                counts.put(c, newCount);
            }
        }
        return "";
    }

}
