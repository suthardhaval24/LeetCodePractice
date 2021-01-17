import java.util.*;

import javax.sound.midi.Soundbank;

public class FLPositionArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements in array in sorted order");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter target element");
		int target = sc.nextInt();
		int temp[] = searchRange(a, target);
		for (int t : temp) {
			System.out.println(t);
		}
	}

	static int[] searchRange(int nums[], int target) {
		int start = 0;
		int end = nums.length - 1;
		int middle = 0;
		int[] result = { -1, -1 };

		// finding first index
		while (start <= end) {
			middle = (start + end) / 2;

			if (nums[middle] == target) {
				result[0] = middle;
				end = middle - 1;
			} else if (nums[middle] > target) {
				end = middle - 1;
			} else if (nums[middle] < target) {
				start = middle + 1;
			}
		}

		start = 0;
		end = nums.length - 1;

		// finding last index
		while (start <= end) {
			middle = (start + end) / 2;

			if (nums[middle] == target) {
				result[1] = middle;
				start = middle + 1;
			} else if (nums[middle] < target) {
				start = middle + 1;
			} else if (nums[middle] > target) {
				end = middle - 1;
			}
		}

		return result;
	}
}
