package com.crd.dp;

public class Factorial {
	public static void main(String args[]) {
		Factorial f = new Factorial();
		int ans = 0;
		try {
			ans = f.fact(-1);
			System.out.println("Ans:" + ans);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int fact(int a) throws Exception {
		if (a < 0) {
			throw new RuntimeException("Negative number is Not allowed");
		}

		if (a == 0) {
			return 1;
		}

		return a * fact(a - 1);

	}

}
