package leetcode0513.FindBottomLeftTreeValue;

import TreeNode.TreeNode;

public class Solution {
    private int max = Integer.MIN_VALUE;
    private int res;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    public void dfs(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null && this.max < depth) {
            this.max = depth;
            this.res = node.val;
            return;
        }
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
