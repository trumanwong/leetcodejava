package leetcode1331;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrayRankTransform() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{4, 1, 2, 3}, solution.arrayRankTransform(new int[]{40, 10, 20, 30}));
    }
}