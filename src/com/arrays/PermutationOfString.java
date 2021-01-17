import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
	public static void main(String[] args) {
		String s = "abc";
		// int nums[] = { 1, 2, 3 };
		List<List<String>> ans = find(s);
		for (List<String> a : ans) {
			System.out.println(a);
		}
	}

	private static List<List<String>> find(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		if (s.length() == 0) {
			return res;
		}
		dfs(s, res, new ArrayList<>());
		return res;
	}

	private static void dfs(String s, List<List<String>> res, List<String> temp) {
		if (temp.size() == s.length()) {
			res.add(new ArrayList<>(temp));
		}

		for (int i = 0; i < s.length(); i++) {
			if (temp.contains(String.valueOf(s.charAt(i))))
				continue;
			temp.add(String.valueOf(s.charAt(i)));
			dfs(s, res, temp);
			temp.remove(temp.size() - 1);
		}
	}
}
