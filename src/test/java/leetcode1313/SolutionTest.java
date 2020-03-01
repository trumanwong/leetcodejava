package leetcode1313;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void decompressRLElist() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 4, 4, 4}, solution.decompressRLElist(new int[]{1, 2, 3, 4}));
    }
}