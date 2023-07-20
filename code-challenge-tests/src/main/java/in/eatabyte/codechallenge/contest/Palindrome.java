package in.eatabyte.codechallenge.contest;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    public int canMakePalindrome(String input) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : input.toCharArray()) {
            int count = counts.getOrDefault(c, 0);
            counts.put(c, count + 1);
        }
        int oddCount = 0;
        for (Integer count : counts.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 0 && input.length() % 2 == 0 || oddCount > 1) {
            return 0;
        }
        return 1;
    }

}
