package leetcode1296.DivideArrayinSetsofKConsecutiveNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends Solution {

    @Test
    void testIsPossibleDivide() {
        Solution solution = new Solution();
        boolean res = solution.isPossibleDivide(new int[]{1,2,3,3,4,4,5,6}, 4);
        assertEquals(true, res);
    }
}