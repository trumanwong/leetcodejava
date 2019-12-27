package recursive.swapPairs;

import ListNode.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode temp = next.next;
        next.next = head;
        head.next = swapPairs(temp);
        return next;
    }
}
