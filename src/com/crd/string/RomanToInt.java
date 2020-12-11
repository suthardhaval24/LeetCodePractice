package com.crd.string;

public class RomanToInt {
	public static void main(String args[]) {
		String s = "IV";
		int result = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			result += getValue(s.charAt(i), result);
		}
		System.out.println(result);
	}	

	public static int getValue(char ch, int result) {
		switch (ch) {
		case 'I':
			return (result >= 5 ? -1 : 1);
		case 'V':
			return 5;
		case 'X':
			return 10 * (result >= 50 ? -1 : 1);
		case 'L':
			return 50;
		case 'C':
			return 100 * (result >= 500 ? -1 : 1);
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}
}
