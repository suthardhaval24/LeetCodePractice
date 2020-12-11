package com.string;

public class CheckStringareSameWithSpecialCharacter {
	/**
	 * A = "aab#c#" B="aa" when special character occurs remove previous element
	 * using stack and without using extra memory
	 */

	public static void main(String args[]) {
		String A = "aab#c#";
		String B = "aa";
		System.out.println("Check Using Stack");
		checkWithStack(A, B);
		System.out.println("Check using without stack");
		checkWithoutStack(A, B);
	}

	static void checkWithoutStack(String A, String B) {
		int top = -1;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '#' && i == 0) {
				throw new IllegalArgumentException("string cant start with #");
			}

			if (A.charAt(i) != '#') {
				top++;
			} else if (A.charAt(i) == '#') {
				top--;
			}
		}

		for (int i = 0; i <= top; i++) {
			s.append(A.charAt(i));
		}

		if (s.toString().equals(B)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are different");
		}

	}

	static void checkWithStack(String A, String B) {
		StringBuilder s = new StringBuilder();
		int top = -1;

		char stack[] = new char[A.length()];

		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '#' && i == 0) {
				throw new IllegalArgumentException("string cant start with #");
			}

			if (A.charAt(i) != '#') {
				stack[++top] = A.charAt(i);
			} else if (A.charAt(i) == '#') {
				top--;
			}
		}

		for (int i = 0; i <= top; i++) {
			s.append(stack[i]);
		}

		if (s.toString().equals(B)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are different");
		}
	}

}
