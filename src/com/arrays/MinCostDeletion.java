
public class MinCostDeletion {
	public static void main(String[] args) {
		String s = "aaabbbabbbb";
		int cost[] = { 3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1 };
		int ans = minCost(s, cost);
		System.out.println(ans);
	}

	private static int minCost(String s, int cost[]) {
		int ans = 0;
		if (s == null || s.length() == 0) {
			return ans;
		}
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				ans += Math.min(cost[i], cost[i - 1]);
			}
		}
		return ans;
	}
}
