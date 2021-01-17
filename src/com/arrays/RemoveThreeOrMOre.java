import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RemoveThreeOrMOre {
	public static void main(String[] args) {
		String s = "ABBCCCCDDDDDDDDBAAE";
		String ans = find(s);
		System.out.println(ans);
	}

	private static String find(String s) {
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>(
				(a, b) -> b.getValue() - a.getValue());

		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			pq.add(entry);
		}

		while (!pq.isEmpty() && pq.peek().getValue() >= 3) {
			pq.poll();
		}

		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			char temp = pq.poll().getKey();
			for (int i = 0; i < freq.get(temp); i++) {
				sb.append(temp);
			}
		}
		return sb.toString();
	}
}
