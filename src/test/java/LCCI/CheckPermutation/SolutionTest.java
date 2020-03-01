package LCCI.CheckPermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkPermutation() {
        Solution solution = new Solution();
        assertTrue(solution.CheckPermutation("abc", "bca"));
        assertFalse(solution.CheckPermutation("abc", "bad"));
    }
}