package recursive.swapPairs;

import ListNode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void swapPairs() {
        Solution solution = new Solution();
        ListNode node = ListNode.GenerateListNode(new int[]{1, 2, 3, 4});
        node = solution.swapPairs(node);
        assertArrayEquals(ListNode.GenerateListNode(new int[]{2, 1, 4, 3}).toArray(), node.toArray());
    }
}