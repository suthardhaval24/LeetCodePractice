package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelBinary {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.left.right = new TreeNode(7);

        List<Double> ans = findAverage(root);
        for (double d : ans) {
            System.out.print(d + " ");
        }
    }

    private static List<Double> findAverage(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return list;
        }

        double sum = 0;
        q.offer(root);
        while (!q.isEmpty()) {
            sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                sum += temp.val;
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
            list.add(sum / size);
        }
        return list;
    }

}
