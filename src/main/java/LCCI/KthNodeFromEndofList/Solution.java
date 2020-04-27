package LCCI.KthNodeFromEndofList;

import ListNode.ListNode;

public class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head, slow = head;
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
