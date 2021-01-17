import java.util.HashSet;
import java.util.Set;

public class SmallestPostiveInteger {
	public static void main(String[] args) {
		int a[] = { -1, -3 };
		int ans = find(a);
		System.out.println(ans);
	}

	private static int find(int A[]) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : A) {
			if (i > 0) {
				set.add(i);
			}
		}

		for (int i = 1; i <= A.length + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return 0;
	}
}
 