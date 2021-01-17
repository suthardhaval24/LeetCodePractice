
public class AppendNumberToMax {
	public static void main(String[] args) {
		int n = 273;
		int ans = makeItMax(n, 3);
		System.out.println(ans);
	}

	private static int makeItMax(int n, int k) {
		if (n == 0) {
			return k * 10;
		}

		int sign = n / Math.abs(n);
		int count = 0;
		int positon = 1;
		int maxValue = Integer.MIN_VALUE;
		int num = n;
		while (num > 0) {
			count++;
			num /= 10;
		}

		for (int i = 0; i <= count; i++) {
			int newValue = ((n / positon) * (positon * 10)) + (k * positon) + (n % positon);
			if (newValue * sign > maxValue) {
				maxValue = newValue * sign;
			}
			positon = positon * 10;
		}
		return maxValue;

	}
}
