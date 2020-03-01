package LCCI.PalindromePermutation;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        int odd = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                odd++;
            }
        }
        return odd <= 1;
    }
}
