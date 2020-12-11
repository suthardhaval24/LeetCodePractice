package com.crd.stack;

public class StackImpl {

	static final int MAX = 1000; // size of stack
	int top;
	int a[] = new int[MAX];

	StackImpl() {
		top = -1;
	}

	boolean isEmpty() {
		return (top < 0);
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}

		else {
			top++;
			a[top] = x;
			System.out.println(x + " Pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack is Underflow");
			return 0;
		} else {
			int x = a[top];
			top--;
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}

	public static void main(String args[]) {

		StackImpl s = new StackImpl();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		System.out.println("pop element" + s.pop());
		System.out.println(s.peek());

	}

}
