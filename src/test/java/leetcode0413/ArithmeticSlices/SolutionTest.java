package leetcode0413.ArithmeticSlices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numberOfArithmeticSlices() {
        Solution solution = new Solution();
        assertEquals(3, solution.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }
}