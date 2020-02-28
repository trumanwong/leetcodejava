package LCCIIsUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isUnique() {
        Solution solution = new Solution();
        assertTrue(solution.isUnique("abc"));
        assertFalse(solution.isUnique("leetcode"));
    }
}