package LCCI.IsUnique;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (Character c : astr.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
