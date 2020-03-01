package leetcode5344;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int v : nums) {
            list.add(v);
        }
        Collections.sort(list);
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = list.indexOf(nums[i]);
        }
        return res;
    }
}
