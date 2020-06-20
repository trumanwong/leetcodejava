package leetcode1480;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void runningSum() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 3, 6, 10}, solution.runningSum(new int[]{1, 2, 3, 4}));
    }
}