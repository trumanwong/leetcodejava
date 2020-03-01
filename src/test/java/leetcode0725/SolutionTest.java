package leetcode0725;

import ListNode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void splitListToParts() {
        Solution solution = new Solution();
        ListNode[] nodes = new ListNode[]{new ListNode(1), new ListNode(2), new ListNode(3), null, null};
        assertArrayEquals(nodes, solution.splitListToParts(ListNode.Generate(new int[]{1, 2, 3}), 5));
        nodes = new ListNode[]{ListNode.Generate(new int[]{1, 2, 3, 4}), ListNode.Generate(new int[]{5, 6, 7}), ListNode.Generate(new int[]{8, 9, 10})};
        assertArrayEquals(nodes, solution.splitListToParts(ListNode.Generate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 3));
        nodes = new ListNode[]{ListNode.Generate(new int[]{1, 2}), new ListNode(3)};
        assertArrayEquals(nodes, solution.splitListToParts(ListNode.Generate(new int[]{1, 2, 3}), 2));
    }
}