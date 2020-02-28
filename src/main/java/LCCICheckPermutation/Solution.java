package LCCICheckPermutation;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        for (Character c : s2.toCharArray()) {
            if (map.get(c) == null) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
