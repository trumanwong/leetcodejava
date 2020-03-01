package LCCI.StringtoURL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void replaceSpaces() {
        Solution solution = new Solution();
        assertEquals("Mr%20John%20Smith", solution.replaceSpaces("Mr John Smith    ", 13));
        assertEquals("%20%20%20%20%20", solution.replaceSpaces("               ", 5));
    }
}