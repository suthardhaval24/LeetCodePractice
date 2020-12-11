package com.string;

import java.util.*;

public class ValidParanthesis {
	public static void main(String args[]) {
		String s = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				stack.push(s.charAt(i));
			else {
				if(stack.empty())
					System.out.println("Not valid");
				char c = stack.pop();
				if (!(s.charAt(i) == ')' && c == '(' || s.charAt(i) == ']' && c == '['
						|| s.charAt(i) == '}' && c == '{'))
					System.out.println("Not Valid");
			}
		}
		System.out.println(stack.isEmpty() ? "Valid" : "Not Valid");
	}
}
