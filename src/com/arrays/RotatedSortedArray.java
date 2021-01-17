
public class RotatedSortedArray {
	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 5;
		int index = search(a, target);
		System.out.println(index);
	}

	private static int search(int a[], int target) {
		int left = 0;
		int right = a.length - 1;
		while (left < right) {
			int mid = left + (right - left / 2);
			if (a[mid] == target) {
				return mid;
			} else if (a[left] <= a[mid]) {
				if (target >= a[left] && target < a[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (target > a[mid] && target <= a[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return a[left] == target ? left : -1;
	}
}
