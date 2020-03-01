package LCCI.PalindromePermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canPermutePalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.canPermutePalindrome("tactcoa"));
    }
}