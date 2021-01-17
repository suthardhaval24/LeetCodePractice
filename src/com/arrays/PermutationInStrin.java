import java.util.Arrays;

public class PermutationInStrin {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(findPermutation(s1, s2));
	}

	private static boolean findPermutation(String S1, String S2) {
		if (S2.length() < S1.length()) {
			return false;
		}

		int o_hash[] = new int[26];
		for (char c : S1.toCharArray()) {
			o_hash[c - 'a']++;
		}

		int a_hash[] = new int[26];
		int n = S1.length();

		for (int i = 0; i < S2.length(); i++) {
			if (i >= n) {
				char ch = S2.charAt(i - n);
				a_hash[ch - 'a']--;
			}

			char c = S2.charAt(i);
			a_hash[c - 'a']++;

			if (Arrays.equals(o_hash, a_hash)) {
				return true;
			}
		}
		return false;

	}
}
