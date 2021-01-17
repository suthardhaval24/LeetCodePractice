import java.util.ArrayList;
import java.util.List;

public class TripletSum {
	public static void main(String[] args) {
		int a[] = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> ans = find(a);
		for (List<Integer> b : ans) {
			System.out.println(b);
		}
	}

	private static List<List<Integer>> find(int a[]) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < a.length - 2; i++)
			for (int j = i + 1; j < a.length - 1; j++)
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(a[i]);
						temp.add(a[j]);
						temp.add(a[k]);
						result.add(temp);
					}
				}

		return result;
	}

}
