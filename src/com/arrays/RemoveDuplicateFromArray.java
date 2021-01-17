import java.util.*;

public class RemoveDuplicateFromArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements in array in sorted order");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int num = removeDuplicates(a);
		System.out.println(num);
	}

//	 public static int removeDuplicates(int[] nums) {
//	        Set<Integer> count = new HashSet<>();
//	            
//	        for(int i=0;i<nums.length;i++){
//	            count.add(nums[i]);
//	        }
//	        
//	        return count.size();
//	    }

	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}
}