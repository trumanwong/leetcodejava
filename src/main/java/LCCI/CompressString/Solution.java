package LCCI.CompressString;

public class Solution {
    public String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        Character last = null;
        int count = 0;
        for (Character c : S.toCharArray()) {
            if (last != c) {
                if (last != null) {
                    sb.append(last.toString()).append(count);
                }
                last = c;
                count = 1;
            } else {
                count++;
            }
        }
        if (last != null) {
            sb.append(last.toString()).append(count);
        }
        return sb.length() < S.length() ? sb.toString() : S;
    }
}
