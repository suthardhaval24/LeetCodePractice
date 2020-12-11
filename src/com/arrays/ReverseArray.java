package com.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int left=0;
        int right = a.length-1;
        while(left<right){
            int temp = a[left];
            a[left]= a[right];
            a[right]=temp;
            left++;
            right--;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
