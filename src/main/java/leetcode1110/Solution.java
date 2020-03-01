package leetcode1110;

import TreeNode.TreeNode;

import java.util.*;

public class Solution {
    private Set<Integer> set;
    private List<TreeNode> nodes;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        this.set = new HashSet<>();
        this.nodes = new ArrayList<TreeNode>();
        for (int v : to_delete) {
            this.set.add(v);
        }
        root = recursive(root);
        if (root != null) {
            this.nodes.add(root);
        }
        return this.nodes;
    }

    private TreeNode recursive(TreeNode node) {
        if (node == null) {
            return null;
        }

        if (node.left == null && node.right == null) {
            return this.set.contains(node.val) ? null : node;
        }

        TreeNode left = recursive(node.left);
        TreeNode right = recursive(node.right);
        if (this.set.contains(node.val)) {
            if (left != null) {
                this.nodes.add(left);
            }
            if (right != null) {
                this.nodes.add(right);
            }
            return null;
        }
        node.left = left;
        node.right = right;
        return node;
    }
}
