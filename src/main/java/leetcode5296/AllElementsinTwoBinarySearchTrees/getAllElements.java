package leetcode5296.AllElementsinTwoBinarySearchTrees;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class getAllElements {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        if (root1 != null) {
            res.addAll(recursive(root1));
        }
        if (root2 != null) {
            res.addAll(recursive(root2));
        }
        Collections.sort(res);
        return res;
    }

    public List<Integer> recursive(TreeNode node) {
        List<Integer> res = new ArrayList<>();
        if (node.left != null) {
            res.addAll(recursive(node.left));
        }
        if (node.right != null) {
            res.addAll(recursive(node.right));
        }
        res.add(node.val);
        return res;
    }
}
