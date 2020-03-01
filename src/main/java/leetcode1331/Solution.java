package leetcode1331;

import java.util.*;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] temp = arr.clone();
        int[] res = new int[arr.length];
        Arrays.sort(temp);
        int index = 1;
        for (int v : temp) {
            if (map.get(v) == null) {
                map.put(v, index++);
            }
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
