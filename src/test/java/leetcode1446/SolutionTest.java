package leetcode1446;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxPower() {
        Solution solution = new Solution();
        assertEquals(2, solution.maxPower("leetcode"));
        assertEquals(5, solution.maxPower("abbcccddddeeeeedcba"));
        assertEquals(5, solution.maxPower("triplepillooooow"));
        assertEquals(11, solution.maxPower("hooraaaaaaaaaaa"));
    }
}