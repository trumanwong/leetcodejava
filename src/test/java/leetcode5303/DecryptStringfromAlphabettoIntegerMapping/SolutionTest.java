package leetcode5303.DecryptStringfromAlphabettoIntegerMapping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void freqAlphabets() {
        Solution solution = new Solution();
        assertEquals("jkab", solution.freqAlphabets("10#11#12"));
        assertEquals("acz", solution.freqAlphabets("1326#"));
        assertEquals("y", solution.freqAlphabets("25#"));
    }
}