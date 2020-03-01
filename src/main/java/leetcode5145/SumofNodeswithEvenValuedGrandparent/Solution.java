package leetcode5145.SumofNodeswithEvenValuedGrandparent;

import TreeNode.TreeNode;

public class Solution {
    private int values;
    public int sumEvenGrandparent(TreeNode root) {
        this.values = 0;
        recursive(root, 0, 0);
        return this.values;
    }

    private void recursive(TreeNode node, int parent, int grandparent) {
        if (node == null) {
            return;
        }
        if (grandparent != 0 && grandparent % 2 == 0) {
            this.values += node.val;
        }

        recursive(node.left, node.val, parent);
        recursive(node.right, node.val, parent);
    }
}
