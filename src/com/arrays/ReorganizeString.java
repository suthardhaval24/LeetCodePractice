import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
	public static void main(String[] args) {
		String s = "abaa";
		String ans = reOrganizeString(s);
		System.out.println(ans);
	}

	private static String reOrganizeString(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}

		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		PriorityQueue<Character> pq = new PriorityQueue<Character>((p, q) -> freq.get(q) - freq.get(p));
		pq.addAll(freq.keySet());
		StringBuilder sb = new StringBuilder();
		while (pq.size() > 1) {
			char curr = pq.remove();
			char next = pq.remove();
			sb.append(curr);
			sb.append(next);
			freq.put(curr, freq.get(curr) - 1);
			freq.put(next, freq.get(next) - 1);
			if (freq.get(curr) > 0) {
				pq.add(curr);
			}
			if (freq.get(next) > 0) {
				pq.add(next);
			}
		}

		if (!pq.isEmpty()) {
			char last = pq.remove();
			if (freq.get(last) > 1) {
				return "";
			}
			sb.append(last);
		}

		return sb.toString();

	}

}
