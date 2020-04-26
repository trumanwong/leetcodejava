package leetcode1417;

public class Solution {
    public String reformat(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder nums = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                nums.append(s.charAt(i));
            }
        }

        if (Math.abs(nums.length() * 2 - s.length()) > 1) {
            return "";
        }

        boolean numFirst = false;
        if (nums.length() * 2 > s.length()) {
            numFirst = true;
        }
        int i = 0, j = 0;
        while (i < s.length() || j < nums.length()) {
            if (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                i++;
                continue;
            }
            if (!numFirst) {
                if (i < s.length()) {
                    res.append(s.charAt(i++));
                }
                if (j < nums.length()) {
                    res.append(nums.charAt(j++));
                }
            } else {
                if (j < nums.length()) {
                    res.append(nums.charAt(j++));
                }
                if (i < s.length()) {
                    res.append(s.charAt(i++));
                }
            }
        }
        return res.toString();
    }
}
