package com.problems;
/*
Leetcode Medium
 */
public class ProductOfTheArrayItSelf {
    public static void main(String[] args) {
        int nums[] ={-5,2,-4};
        int ans[] = bruteforce(nums);
        System.out.println("Brute force with 0(n2)");
        for(int i:ans){
            System.out.print(i +" ");
        }
        System.out.println();

        ans = Optimize(nums);
        System.out.println("Optimize with O(n)");
        for(int i:ans){
            System.out.print(i +" ");
        }
    }

    public  static int[] bruteforce(int[] nums){
        int ans[] = new int[nums.length];

        int prod =1;

        for(int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    prod *= nums[j];
                }
            }
            ans[i]=prod;
            prod=1;
        }
        return ans;
    }

    public  static int[] Optimize(int[] nums){
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int sum[] = new int[n];

        left[0] =1;
        right[n-1] =1;


        for(int i=1;i<n;i++){
            left[i] = nums[i-1]*left[i-1];
        }

        for(int i=n-2;i>=0;i--){
            right[i] = nums[i+1]*right[i+1];
        }

        for(int i=0;i<n;i++){
            sum[i] = left[i]*right[i];
        }
        return sum;
    }
}
