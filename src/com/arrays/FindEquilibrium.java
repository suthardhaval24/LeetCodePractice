
public class FindEquilibrium {
	public static void main(String[] args) {
		int a[] = { -7, 1, 5, 2, -4, 3, 0 };
		int index = findEquilibrium(a);
		System.out.println(index);
	}

	private static int findEquilibrium(int a[]) {
		if (a.length < 3) {
			return -1;
		}

		int left = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		for (int i = 0; i < a.length; i++) {
			sum -= a[i];
			if (left == sum) {
				return i;
			}

			left += a[i];
		}
		return -1;
	}
}
