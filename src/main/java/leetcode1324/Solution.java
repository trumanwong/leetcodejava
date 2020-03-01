package leetcode1324;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String[] strs = s.split(" ");
        int index = 0, count = 0;
        while (true) {
            StringBuilder temp = new StringBuilder();
            count = 0;
            for (String str : strs) {
                if (str.length() <= index) {
                    temp.append(" ");
                    count++;
                } else {
                    temp.append(str.charAt(index));
                }
            }

            while (temp.length() > 0 && temp.charAt(temp.length() - 1) == ' ') {
                temp = new StringBuilder(temp.substring(0, temp.length() - 1));
            }
            if (temp.length() > 0) {
                res.add(temp.toString());
            }
            if (count == strs.length) {
                break;
            }
            index++;
        }
        return res;
    }
}
