package com.cerner;

public class ReverseString {
    public static void main(String args[]) {
        String s = "Hello \nHow are you";
        s = s.replaceAll("\\n", "");
        String[] w = s.split("\\s+");
        s = s.replaceAll("\\s+", "");
        for (int i = 0; i < w.length / 2; i++) {
            String temp = w[i];
            w[i] = w[w.length - i - 1];
            w[w.length - i - 1] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : w) {
            sb.append(str);
        }

        String ans = s.concat(sb.toString());
        System.out.println(ans);
    }
}
