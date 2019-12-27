package leetcode0697.DegreeofanArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findShortestSubArray() {
        Solution solution = new Solution();
        assertEquals(2, solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        assertEquals(6, solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }
}