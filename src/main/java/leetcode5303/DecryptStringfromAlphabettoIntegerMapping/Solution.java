package leetcode5303.DecryptStringfromAlphabettoIntegerMapping;

public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        String[] str = s.split("#");
        for (int i = 0; i < str.length; i++) {
            if (s.charAt(s.length() - 1) != '#' && i == str.length - 1) {
                for (int j = 0; j < str[i].length(); j++) {
                    res.append((char)(str[i].charAt(j) - '0' + 96));
                }
            } else if(str[i].length() > 2) {
                for (int j = 0; j < str[i].length() - 2; j++) {
                    res.append((char)(str[i].charAt(j) - '0' + 96));
                }
                res.append((char) (Integer.parseInt(str[i].substring(str[i].length() - 2)) + 96));
            } else {
                res.append((char) (Integer.parseInt(str[i]) + 96));
            }
        }
        return res.toString();
    }
}
