package com.problems;

//this will work for power of 2,3,4 ...n

public class PowerOf2 {
    public static void main(String[] args) {
        int n=513;
        boolean ans = checkPowerOf2(n);
        System.out.println(ans);
    }

    private static boolean checkPowerOf2(int n){
        if(n<=0){
            return false;
        }
        else{
            while(n>1){
                if(n%2!=0) return false;
                n/=2;
            }
        }
        return true;
    }
}
