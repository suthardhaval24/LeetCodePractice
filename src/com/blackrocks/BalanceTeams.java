package com.blackrocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BalanceTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(0);
		list.add(2);
		list.add(2);
		list.add(1);
		System.out.println(maxBalancedTeams(list, 3));
	}

	public static int maxBalancedTeams(List<Integer> developers, int maxNewHires) {
		Collections.sort(developers); 
		// 0 1 2 2 3
		
		int[] prefixSum = new int[developers.size() + 1]; 
	
		prefixSum[1] = developers.get(0);

		for (int i = 1; i < prefixSum.length - 1; ++i) {
			prefixSum[i + 1] = prefixSum[i] + developers.get(i);
		}

		int max = developers.size(); 
		int min = 1; 
		int ans = 1;
		while (min <= max) {
			int mid = (max + min) / 2; 
			if (check(prefixSum, mid, maxNewHires, developers)) {
				ans = mid;
				min = mid + 1; 
			} else {
				max = mid - 1; 
			}
		}
		return ans;
	}

	public static boolean check(int[] pSum, int len, int maxHire, List<Integer> dev) {

		int i = 0;
		int j = len;
		while (j <= dev.size()) {
			int maxSize = dev.get(j - 1); // the last element of the sliding window will be having the max size in the
											// current window as we sorted the list at the start
			int totalMembers = maxSize * len; // for all teams to have same number of members, the total number of
												// members should be equal to (length of window)*(max team size of
												// current window)
			int currMembers = pSum[j] - pSum[i]; // the current number of members in all the teams of the current
													// sliding window
			if (currMembers + maxHire >= totalMembers) {
				return true; // Now if the current members of the window, plus the members we are allowed to
								// add, is greater or equal to the total members we wanted, return true
			} else {
				i++;
				j++;
			}
		}
		return false;
	}
}