package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        List<List<Integer>> ans = pathSum(root, 22);
        for (List<Integer> a : ans) {
            System.out.println(a);
        }
    }

    private static List<List<Integer>> pathSum(TreeNode root, int sum) {
        //dfs
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int SUM = 0;
        List<Integer> path = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        TreeNode pre = null;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                path.add(curr.val);
                SUM += curr.val;
                curr = curr.left;
            }

            curr = stack.peek();
            if (curr.right != null && curr.right != pre) {
                curr = curr.right;
                continue;
            }

            if (curr.left == null && curr.right == null && SUM == sum)
                res.add(new ArrayList<Integer>(path));

            pre = curr;
            stack.pop();
            path.remove(path.size() - 1);
            SUM -= curr.val;
            curr = null;
        }
        return res;
    }
}
