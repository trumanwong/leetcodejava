package leetcode1296.DivideArrayinSetsofKConsecutiveNumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int v : nums) {
            if (map.containsKey(v)) {
                map.put(v, map.get(v) + 1);
            } else {
                map.put(v, 1);
            }
        }
        Arrays.sort(nums);

        for (int num : nums) {
            Integer obj = map.get(num);
            if (obj == 0) {
                continue;
            }
            // 消耗第一个元素，再找k - 1个元素
            map.put(num, --obj);
            for (int j = 0; j < k - 1; j++) {
                Integer temp = map.get(++num);
                if (temp == null || temp == 0) {
                    return false;
                } else {
                    map.put(num, --temp);
                }
            }
        }
        return true;
    }
}
