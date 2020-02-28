package leetcode0648.ReplaceWords;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Set<String> set = new HashSet<>(dict);

        StringBuilder res = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (set.contains(prefix)) {
                    break;
                }
            }
            if (res.length() > 0) {
                res.append(" ");
            }
            res.append(prefix);
        }
        return res.toString();
    }
}
