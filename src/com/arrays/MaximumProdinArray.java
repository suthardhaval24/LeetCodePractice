package com.arrays;

public class MaximumProdinArray {
    public static void main(String args[]){
        int a[]= {1,1,1,1};
        int prod = maxProduct(a);
        System.out.println(prod);
    }

    private static int maxProduct(int a[]){
        int prod =0;
        for(int i=0;i<a.length-1;i++)
            for(int j=i+1;j<a.length;j++)
                if((a[i]-1)*(a[j]-1)>prod){
                    prod = (a[i]-1)*(a[j]-1);
                }
        return prod;
    }

}
