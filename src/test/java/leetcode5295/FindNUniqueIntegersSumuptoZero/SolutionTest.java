package leetcode5295.FindNUniqueIntegersSumuptoZero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sumZero() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{-2,-1,0,1,2}, solution.sumZero(5));
        assertArrayEquals(new int[]{-2,-1,1,2}, solution.sumZero(4));
        assertArrayEquals(new int[]{-1,0,1}, solution.sumZero(3));
        assertArrayEquals(new int[]{-1,1}, solution.sumZero(2));
        assertArrayEquals(new int[]{0}, solution.sumZero(1));
    }
}