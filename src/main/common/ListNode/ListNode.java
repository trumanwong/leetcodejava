package ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode Generate(int[] arr) {
        ListNode node = new ListNode(0);
        ListNode dummyHead = node;
        for (int value : arr) {
            dummyHead.next = new ListNode(value);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNode)) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return toString().equals(listNode.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        String res = String.valueOf(this.val);
        if (this.next != null) {
            res += "," + this.next.toString();
        }
        return res;
    }
}
