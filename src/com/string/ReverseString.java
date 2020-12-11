package com.string;

/*
Leetcode easy
 */
public class ReverseString {
    public static void main(String[] args) {
            char s[]  =  {'H','a','n','n','a','h'};
            ReverseString st = new ReverseString();
            st.reverseString(s);
            for(char c : s){
                System.out.print(c);
            }
    }

    private  void reverseString(char [] s){
        int n = s.length;
        for(int i=0;i < n/2;i++){
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }
}
