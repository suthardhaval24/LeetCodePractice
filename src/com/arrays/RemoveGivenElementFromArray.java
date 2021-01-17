import java.util.Scanner;

public class RemoveGivenElementFromArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements in array in sorted order");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element value to be removed");
		int num = sc.nextInt();
		
		int ans = removeElement(a, num);
		
		System.out.println(ans);
	}
	
	public static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0; i < nums.length; i++)
            if (nums[i] != val)
                nums[j++] = nums[i];
        return j;
    }
	
	
}
