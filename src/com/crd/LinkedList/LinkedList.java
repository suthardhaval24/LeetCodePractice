package com.crd.LinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	Node head = null;

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.append(30);
		ll.print();
	}

	public void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new_node;
			return;
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next = new_node;
		return;
		
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp =temp.next;
		}
	}

}
