package com.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String s[] = {"flower", "flow","flight"};
        String ans = lonngestCommonPrefix(s);
        System.out.println(ans);
    }

    private static String lonngestCommonPrefix(String s[]){
        if(s == null || s.length == 0){
            return "";
        }

        StringBuilder ans =  new StringBuilder();
        String pre = s[0];
        int i=1;
        while(i<s.length){
            while(s[i].indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }
        return pre;
    }
}
