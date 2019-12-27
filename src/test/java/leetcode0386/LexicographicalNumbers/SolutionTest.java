package leetcode0386.LexicographicalNumbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lexicalOrder() {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>();
        for (int v : arr) {
            list.add(v);
        }
        assertEquals(list.toString(), solution.lexicalOrder(13).toString());
    }
}