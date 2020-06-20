package leetcode1446;

public class Solution {
    public int maxPower(String s) {
        int res = 1, count = 1;
        char[] characters = s.toCharArray();
        char last = characters[0];
        for (int i = 1; i < characters.length; i++) {
            if (last == characters[i]) {
                count++;
            } else {
                if (count > res) {
                    res = count;
                }
                last = characters[i];
                count = 1;
            }
        }
        if (count > res) {
            res = count;
        }
        return res;
    }
}
