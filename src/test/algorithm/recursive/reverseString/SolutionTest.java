package recursive.reverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseString() {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        Solution solution = new Solution();
        solution.reverseString(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }
}