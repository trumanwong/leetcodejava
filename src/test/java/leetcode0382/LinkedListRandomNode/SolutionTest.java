package leetcode0382.LinkedListRandomNode;

import ListNode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void getRandom() {
        Solution solution = new Solution(ListNode.Generate(new int[]{1, 2, 3}));
        System.out.println(solution.getRandom());
    }
}