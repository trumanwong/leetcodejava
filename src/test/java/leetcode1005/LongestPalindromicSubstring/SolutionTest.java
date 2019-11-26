package leetcode1005.LongestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        Solution solution = new Solution();
        String s = "babad";
        assertEquals("aba", solution.longestPalindrome(s));
        s = "cbbd";
        assertEquals("bb", solution.longestPalindrome(s));
    }
}