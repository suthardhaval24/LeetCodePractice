package com.sort;

import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {2,0,2,1,1,0};
        a = bubbleSort(a);
        for(int b: a){
            System.out.print(b);
        }
    }

    private static int[] bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++)
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        return a;
    }
}
