package leetcode0378.KthSmallestElementinaSortedMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void kthSmallest() {
        Solution solution = new Solution();
        assertEquals(13, solution.kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8));
    }
}