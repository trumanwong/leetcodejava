package leetcode1389;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
