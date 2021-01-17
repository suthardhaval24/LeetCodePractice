
public class SortColors {
	public static void main(String[] args) {
		int a[] = { 2, 0, 1 };
		sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static void sort(int a[]) {
		if (a.length == 1) {
			return;
		}

		int start = 0;
		int index = 0;
		int end = a.length - 1;

		while (index <= end && start < end) {
			if (a[index] == 0) {
				a[index] = a[start];
				a[start] = 0;
				index++;
				start++;
			} else if (a[index] == 2) {
				a[index] = a[end];
				a[end] = 2;
				end--;
			} else {
				index++;
			}
		}
	}
}
