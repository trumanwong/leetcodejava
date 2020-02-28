package leetcode1310.XORQueriesofaSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void xorQueries() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 7, 14, 8}, solution.xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}));
    }
}