package leetcode5307.ConvertIntegertotheSumofTwoNoZeroIntegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getNoZeroIntegers() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 1}, solution.getNoZeroIntegers(2));
        assertArrayEquals(new int[]{2, 9}, solution.getNoZeroIntegers(11));
        assertArrayEquals(new int[]{11, 999}, solution.getNoZeroIntegers(1010));
    }
}