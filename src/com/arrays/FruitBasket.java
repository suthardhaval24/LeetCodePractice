import java.util.HashMap;
import java.util.Map;

public class FruitBasket {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 2 };
		int ans = findMax(a);
		System.out.println(ans);
	}

	private static int findMax(int a[]) {
		if (a == null || a.length == 0) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 0, j = 0, max = 0;
		while (j < a.length) {
			if (map.size() <= 2) {
				map.put(a[j], j++);
			}

			if (map.size() > 2) {
				int min = a.length - 1;
				for (int val : map.values()) {
					min = Math.min(val, min);
				}
				i = min + 1;
				map.remove(a[min]);
			}

			max = Math.max(j - i, max);
		}
		return max;
	}
}
