package com.arrays;

import java.util.*;

public class FindDistElement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ans=0;
		int a[] = { 1, 1, 1, 2, 2, 2, 3 };
		for(int i=0;i<a.length;i++)
			ans^=a[i];
		System.out.println("with EXOR="+ ans);
		int number = findDistinct(a);
		System.out.println("With hashmap logic="+number);
	}
	
	static int findDistinct(int a[]) {
		Map<Integer,Integer> track= new HashMap<>();
		for(int i=0;i<a.length;i++){
			track.put(a[i], track.getOrDefault(a[i], 0)+1);
		}
		
		 for (Map.Entry mapElement : track.entrySet()) {
			 if((int)mapElement.getValue()==1)
				 return (int)mapElement.getKey();
		 }
		return -1;
	}

}
