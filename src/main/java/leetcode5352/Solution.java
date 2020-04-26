package leetcode5352;

public class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        int i = 97;
        while (n > 0) {
            if ((n - 1) % 2 != 0) {
                sb.append((char) (i++));
                sb.append(String.valueOf((char) (i)).repeat(n - 1));
                n = 0;
            } else {
                sb.append((char)(i++));
                n--;
            }
        }
        return sb.toString();
    }
}
