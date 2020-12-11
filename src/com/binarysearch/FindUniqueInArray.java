package com.binarysearch;

public class FindUniqueInArray {


    /*
     You are given a sorted array consisting of only integers where every element appears exactly twice,
     except for one element which appears exactly once. Find this single element that appears only once.
    Input: [1,1,2,3,3,4,4,8,8]
    Output: 2
     */
    public static void main(String[] args) {
        int a [] = {3,3,7,7,10,11,11};
        int num = uniqueElement(a);
        System.out.println(num);
    }

    static public int uniqueElement(int a[]){
        if(a.length==1){
            return a[0];
        }

        int left = 0;
        int right =a.length-1;
        while(left<right){
            int mid = left +(right-left)/2;
            //if mid is odd number then convert to even as there will be always odd elements in array
            if(mid%2==1){
                mid --;
            }
            if(a[mid]!=a[mid+1]){
                right = mid;
            }
            else{
                left =mid+2;
            }

        }
        return a[left];
    }
}
