package leetcode0697.DegreeofanArray;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(), right = new HashMap<>(), count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            left.putIfAbsent(nums[i], i);   // 第一次出现的索引
            right.put(nums[i], i);          // 最后一次出现的索引
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        int res = nums.length;
        int max = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == max) {
                // 对于出现次数最多的每个元素，right[x] - left[x] + 1是候选答案，取这些候选的最小值
                res = Math.min(res, right.get(x) - left.get(x) + 1);
            }
        }
        return res;
    }
}
