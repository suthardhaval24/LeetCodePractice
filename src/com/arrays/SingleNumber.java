package com.arrays;

/**
 * Bitwise  : O(n)
 */

//when every number appears twice except one number appears once
public class SingleNumber {
    public static void main(String[] args) {
        int a[]={2,2,1};
        int res = singleNumber(a);
        System.out.println(res);
    }

    private static int singleNumber(int a[]){
        int res = a[0];
        for(int i=1;i< a.length;i++){
            res^=a[i];
        }
        return res;
    }

}
