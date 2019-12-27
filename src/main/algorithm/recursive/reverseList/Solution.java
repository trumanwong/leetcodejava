package recursive.reverseList;

import ListNode.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode recurisve(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = recurisve(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}