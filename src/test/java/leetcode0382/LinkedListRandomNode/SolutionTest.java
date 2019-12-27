package leetcode0382.LinkedListRandomNode;

import ListNode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getRandom() {
        Solution solution = new Solution(ListNode.GenerateListNode(new int[]{1, 2, 3}));
        System.out.println(solution.getRandom());
    }
}