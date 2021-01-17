
public class MinSizeSubArray {
	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 2, 4, 3 };
		int s = 7;
		int min = findMin(a, s);
		System.out.println(min);
	}

	private static int findMin(int a[], int sum) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;
		int left = 0;
		int sum_value = 0;
		for (int i = 0; i < a.length; i++) {
			sum_value += a[i];
			while (sum_value >= sum) {
				ans = Math.min(i + 1 - left, ans);
				sum_value -= a[left];
				left++;
			}
		}
		return (ans != Integer.MAX_VALUE) ? ans : 0;
	}
}
