import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostFrequentElement {
	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int ans[] = topKFrequent(a, k);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

	private static int[] topKFrequent(int a[], int k) {
		List<Integer> ans = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(
				(p, q) -> q.getValue() - p.getValue());

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			pq.offer(entry);
		}
		
		while(k>0) {
			ans.add(pq.poll().getKey());
			k--;
		}
		
		int result[] = new int[ans.size()];
		for(int i=0;i<ans.size();i++) {
			result[i] = ans.get(i);
		}
		
		return result;
	}

}
