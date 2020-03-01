package leetcode5345;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String rankTeams(String[] votes) {
        Map<Character, int[]> map = new HashMap<>();
        int N = votes[0].length();
        Character[] cs = new Character[N];
        int idx = 0;
        for(String v: votes) {
            for(int i = 0; i < v.length(); i++) {
                char c = v.charAt(i);
                if(!map.containsKey(c)) {
                    map.put(c, new int[N]);
                    Arrays.fill(map.get(c), 0);
                    cs[idx++] = c;
                }
                map.get(c)[i]++;
            }
        }
        Arrays.sort(cs, new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                int[] co1 = map.get(c1);
                int[] co2 = map.get(c2);
                for(int i = 0; i < N; i++) {
                    if (co1[i] != co2[i]) {
                        return co2[i] - co1[i];
                    }
                }
                return c1 - c2;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(char c: cs) {
            sb.append(c);
        }
        return sb.toString();
    }
}
