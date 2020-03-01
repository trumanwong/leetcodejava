package leetcode1323;

public class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        int res = 0;
        int len = str.length() - 1;
        boolean isFirst = true;
        for (Character c : str.toCharArray()) {
            if (c == '6' && isFirst) {
                isFirst = false;
                res += 9 * (int) Math.pow(10, len);
            } else {
                res += (c - '0') * (int) Math.pow(10, len);
            }
            len--;
        }
        return res;
    }
}
