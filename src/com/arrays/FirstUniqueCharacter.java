import java.util.*;

public class FirstUniqueCharacter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (a[s.charAt(i) - 'a'] == 1) {
				System.out.println(i);
			}
		}
	}
}