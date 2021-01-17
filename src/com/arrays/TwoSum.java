import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int a[] = { 3,3};
		int target = 6;
		int ans[] = find(a, target);
		for (int i : ans) {
			System.out.println(i);
		}
	}

	private static int[] find(int a[], int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int ans[] = new int[2];
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(target - a[i])) {
				ans[1] = i;
				ans[0] = map.get(target - a[i]);
			} else {
				map.put(a[i], i);
			}
		}
		return ans;
	}
}
