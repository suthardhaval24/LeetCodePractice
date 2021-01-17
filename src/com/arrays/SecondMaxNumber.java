package com.problems;
/*
JP morgan/GoldMan Sachs
 */

public class SecondMaxNumber {
	public static void main(String args[]) {
		int a[] = {20,10,5,7,30};
		int firstMax=a[0];
		int seondMax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>firstMax) {
				seondMax=firstMax;
				firstMax=a[i];
			}
		}
		System.out.println(seondMax);
	}
}
