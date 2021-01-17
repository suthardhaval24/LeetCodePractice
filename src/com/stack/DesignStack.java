package com.stack;

import java.util.Stack;

public class DesignStack {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(7);
        stack.push(9);
        stack.push(4);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());
    }
}

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    ;

    public void push(int x) {
        if (min > x) {
            minStack.push(min);
            minStack.push(x);
            min = x;
        } else {
            minStack.push(x);
        }
    }

    public void pop() {
        if (minStack.peek() == min) {
            minStack.pop();
            min = minStack.peek();
            minStack.pop();
        } else {
            minStack.pop();
        }
    }

    public int peek() {
        return minStack.peek();
    }

    public int min() {
        return min;
    }

}



