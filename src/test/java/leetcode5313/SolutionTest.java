package leetcode5313;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void angleClock() {
        Solution solution = new Solution();
        assertEquals(165, solution.angleClock(12, 30));
        assertEquals(75, solution.angleClock(3, 30));
        assertEquals(7.5, solution.angleClock(3, 15));
        assertEquals(0, solution.angleClock(12, 0));
    }
}