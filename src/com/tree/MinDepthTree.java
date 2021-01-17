package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int depth = findMinDepth(root);
        System.out.println(depth);
    }

    private static int findMinDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int minDepth =1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left==null && curr.right==null){
                    return minDepth;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            minDepth++;
        }
        return minDepth;
    }

}
