package com.crd;

public class Timepass {
    public static void main(String[] args) {
        Sum sum = new Sum(10,20);
        System.out.println(sum.a+" "+sum.b);
        int c = calculateSum(sum);
        System.out.println(c);
        System.out.println(sum.a+" "+sum.b);
    }

    private static int calculateSum(Sum sum){
        sum.a = 20;
        sum.b = 30;
        int c = sum.a+sum.b;
        return c;
    }


}

class Sum{
    int a,b;

    public Sum( int a, int b){
        this.a = a;
        this.b =b;
    }
}