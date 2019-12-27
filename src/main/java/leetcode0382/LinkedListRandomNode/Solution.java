package leetcode0382.LinkedListRandomNode;

import ListNode.ListNode;

import java.util.Random;

public class Solution {
    private ListNode head;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int res = this.head.val;
        ListNode node = this.head.next;
        int i = 2;
        Random random = new Random();
        while (node != null) {
            int r = random.nextInt(i);
            if (r == 0) {
                res = node.val;
            }
            i++;
            node = node.next;
        }
        return res;
    }
}
