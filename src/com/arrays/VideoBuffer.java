import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VideoBuffer {
	public static void main(String[] args) {
		int a[] = { 1, 2,3, 4,4,5};
		int arrivalRate = 2;
		int sequence = 1;
		int index = 0;
		List<Integer> ans = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i += arrivalRate) {
			for (int j = i; j < (i+arrivalRate); j++) {
				if (a[j] == sequence) {
					ans.add(a[j]);
				} else if (!q.isEmpty() && q.contains(sequence)) {
					ans.add(q.poll());
					if (!q.contains(a[j]) && a[j] != sequence && !ans.contains(a[j])) {
						q.add(a[j]);
					}
				} else if (!ans.contains(a[j])) {
					q.offer(a[j]);
				}
				else {
					index = sequence;
					break;
				}
			}
			sequence++;
		}

		if (!q.isEmpty()) {
			while (!q.isEmpty()) {
				if (sequence == q.peek()) {
					ans.add(q.poll());
				} else {
					index = sequence;
				}
				sequence++;
			}
		}

		int finalAns = (sequence - 1) == ans.get(ans.size() - 1) ? -1 : index;
		System.out.println(finalAns);
	}
}
