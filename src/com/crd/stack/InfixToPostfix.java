package com.crd.stack;

import java.util.Stack;

public class InfixToPostfix {
	public static void main(String args[]) {
		String exp = "a+b*(C^D-E)";
		System.out.println(infixToPostfix(exp));
	}

	static int prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	static String infixToPostfix(String exp) {

		String result = new String("");
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				result += ch;
			}

			else if (ch == '(')
				stack.push(ch);
			else if (ch == ')') {
				while (!stack.empty() && stack.peek() != '(') {
					result += stack.pop();
				}

				if (!stack.empty() && stack.peek() != '(') {
					return "Invalid Experssion";
				} else {
					stack.pop();
				}
			}

			else {
				while (!stack.isEmpty() && prec(ch) <= prec(stack.peek())) {
					if (stack.peek() == '(') {
						return "Invalid Expression";
					}
					result += stack.pop();
				}
				stack.push(ch);
			}

		}
		while (!stack.isEmpty()) {
			if (stack.peek() == '(')
				return "Invalid Expression";
			result += stack.pop();
		}
		return result;
	}
}
