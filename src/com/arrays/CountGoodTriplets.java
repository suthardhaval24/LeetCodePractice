package com.arrays;

public class CountGoodTriplets {
    public static void main(String[] args) {
        int arr[] = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        int ans = countGoodTriplest(arr, a, b, c);
        System.out.println(ans);
    }
    private  static int countGoodTriplest(int arr[],int a,int b,int c){
        int count=0;
        for(int i=0;i<arr.length-2;i++)
            for(int j=i+1;j<arr.length-1;j++)
                if(Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
        return  count;
    }
}
