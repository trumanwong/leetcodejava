package ListNode;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode GenerateListNode(int[] arr) {
        ListNode node = new ListNode(0);
        ListNode dummyHead = node;
        for (int i = 0; i < arr.length; i++) {
            dummyHead.next = new ListNode(arr[i]);
            dummyHead = dummyHead.next;
        }
        return node.next;
    }

    public int[] toArray() {
        ListNode dummyHead = this;
        List<Integer> list = new ArrayList<>();
        while(dummyHead != null) {
            list.add(dummyHead.val);
            dummyHead = dummyHead.next;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
