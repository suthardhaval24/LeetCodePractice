import java.util.PriorityQueue;

public class KthLargestInArray {
	public static void main(String[] args) {
		int a[] = {3,2,1,5,6,4};
		int k =2;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((p,q)->q-p);
		for(int i:a) {
			pq.offer(i);
		}
		
		int i=1;
		while(i<k) {
			pq.poll();
			i++;
		}
		
		System.out.println(pq.peek());
		
	}
}
