package com.crd.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left, right;

	Node(int x) {
		this.data = x;
		this.left = this.right = null;
	}
}

public class InsertionInBinaryTree {

	static Node root;

	public static void main(String args[]) {
		InsertionInBinaryTree tree = new InsertionInBinaryTree();
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		System.out.println("Inorder before");
		tree.inorder(root);
		int key = 12;
		tree.insert(root, key);
		System.out.println("Inorder After");
		tree.inorder(root);

	}

	public void inorder(Node root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	public void insert(Node temp, int key) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			} else {
				q.add(temp.left);
			}

			if (temp.right == null) {
				temp.right = new Node(key);
				break;
			} else {
				q.add(temp.right);
			}
		}

	}

}
