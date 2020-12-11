package com.arrays;

/*
Leetcode easy
 */

import java.util.*;

public class FindNumberWithEvenDigits {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = {12,345,2,6,7896};
		int b = findNumber(a);
		System.out.println(b);
	}
	
	public static int findNumber(int nums[]) {
		int count= 0;
        for(int i=0;i<nums.length;i++){
            int freq=0;
            int temp=nums[i];
            while(temp>0){
                temp=temp/10;
                freq++;
            }
            if(freq%2==0){
                count++;
            }
        }
        
        if(count>0){
            return count;
        }
        else{
            return 0;
        }
	}

}
