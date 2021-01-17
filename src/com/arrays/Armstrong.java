
public class Armstrong {
	public static void main(String args[]) {
		int n = 153;
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum += rem * rem * rem;
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not amrstrong");
		}
	}
}
