package leetcode1004.MedianofTwoSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArrays() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2));
    }
}