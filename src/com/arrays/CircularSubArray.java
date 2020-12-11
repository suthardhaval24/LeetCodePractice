package com.arrays;
/*

Leetcode medium
Input: [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3
 */

public class CircularSubArray {
    public static void main(String[] args) {
        int A[] =  {-2,-3,-1};
        System.out.println("Maximum circular sum is " +
                maxSubarraySumCircular(A));
    }

    public static int maxSubarraySumCircular(int[] A) {
        int length = A.length;
        int temp[] = new int[length];
        int totalSum=0;
        //get max sum using kadane
        int max_kadane = kadane(A);
        for(int i =0;i<length;i++){
            totalSum+=A[i];
            temp[i] = A[i]*-1;
        }

        int circularSum = totalSum+kadane(temp);

        if(circularSum>max_kadane && circularSum!=0){
            return circularSum;
        }
        else{
            return max_kadane;
        }
    }



    //standar kadane array to find maxsum with numbers are negative
    static int kadane (int a[])
    {
        int maxEndHere = a[0];
        int maxSoFar = a[0];
        for(int i=1;i<a.length;i++){
            maxEndHere = Math.max(a[i], maxEndHere+a[i]);
            maxSoFar = Math.max(maxSoFar,maxEndHere);
        }
        return maxSoFar;
    }


}
