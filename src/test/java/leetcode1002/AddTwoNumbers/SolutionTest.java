package leetcode1002.AddTwoNumbers;

import ListNode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = ListNode.GenerateListNode(new int[]{2, 4, 3});
        ListNode l2 = ListNode.GenerateListNode(new int[]{5, 6, 4});
        ListNode output = ListNode.GenerateListNode(new int[]{7, 0, 8});
        Solution solution = new Solution();
        ListNode ret = solution.addTwoNumbers(l1, l2);
        assertArrayEquals(output.toArray(), ret.toArray());
    }
}