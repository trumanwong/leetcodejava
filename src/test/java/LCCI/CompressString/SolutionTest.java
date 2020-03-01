package LCCI.CompressString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void compressString() {
        Solution solution = new Solution();
        assertEquals("a2b1c5a3", solution.compressString("aabcccccaaa"));
        assertEquals("abbccd", solution.compressString("abbccd"));
    }
}