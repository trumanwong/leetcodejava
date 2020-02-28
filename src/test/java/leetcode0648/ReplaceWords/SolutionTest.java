package leetcode0648.ReplaceWords;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void replaceWords() {
        List<String> dict = new ArrayList<>();
        dict.add("cat");
        dict.add("bat");
        dict.add("rat");
        Solution solution = new Solution();
        assertEquals("the cat was rat by the bat", solution.replaceWords(dict, "the cattle was rattled by the battery"));
    }
}