package com.blackrocks;

public class CircularLeft {
	public static void main(String args[]) {
		String s = "accbb";
		int ans = countStrings(s);
		System.out.println(ans);
	}

	public static int countStrings(String s) {
		int len = s.length();
		String str[] = new String[len];
		str[0] = s;
		for (int i = 1; i < s.length(); i++) {
			String temp = str[i - 1].substring(1) + str[i - 1].substring(0, 1);
			str[i] = temp;
		}

		int ans = 0;
		for (String a : str) {
			if (a.charAt(0) == a.charAt(a.length() - 1)) {
				ans++;
			}
		}
		return ans;
	}
}
