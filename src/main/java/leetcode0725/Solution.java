package leetcode0725;

import ListNode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode dummyHead = root;
        int n = 0;
        while (dummyHead != null) {
            n++;
            dummyHead = dummyHead.next;
        }
        int separate = n / k;
        int remain = n % k;
        dummyHead = root;
        ListNode[] res = new ListNode[k];
        for (int i = 0; i < k; i++) {
            ListNode head = new ListNode(0), write = head;
            for (int j = 0; j < separate + (i < remain ? 1 : 0); j++) {
                write.next = new ListNode(dummyHead.val);
                write = write.next;
                dummyHead = dummyHead.next;
            }
          res[i] = head.next;
        }
        return res;
    }
}
