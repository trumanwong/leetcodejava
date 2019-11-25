package leetcode1001.TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void twoSum() {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] output = new int[]{0, 1};
        int[] res = solution.twoSum(nums, target);
        assertArrayEquals(res, output);
    }
}