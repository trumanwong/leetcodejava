package leetcode5153.DeepestLeavesSum;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<TreeNode> stack = new ArrayList<>(), temp = new ArrayList<>();
        stack.add(root);
        while (stack.size() != 0) {
            temp = stack;
            stack = new ArrayList<>();
            for (TreeNode node : temp) {
                if (node.left != null) {
                    stack.add(node.left);
                }
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
        }
        int res = 0;
        for (TreeNode node : temp) {
            res += node.val;
        }
        return res;
    }
}
