package leetcode1276;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numOfBurgers() {
        Solution solution = new Solution();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        assertEquals(list, solution.numOfBurgers(16, 7));
    }
}