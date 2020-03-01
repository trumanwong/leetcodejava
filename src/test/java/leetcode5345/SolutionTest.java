package leetcode5345;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rankTeams() {
        Solution solution = new Solution();
        assertEquals("ACB", solution.rankTeams(new String[]{"ABC","ACB","ABC","ACB","ACB"}));
        assertEquals("XWYZ", solution.rankTeams(new String[]{"WXYZ","XYZW"}));
        assertEquals("ZMNAGUEDSJYLBOPHRQICWFXTVK", solution.rankTeams(new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"}));
        assertEquals("ABC", solution.rankTeams(new String[]{"BCA","CAB","CBA","ABC","ACB","BAC"}));
        assertEquals("M", solution.rankTeams(new String[]{"M","M","M","M"}));
    }
}