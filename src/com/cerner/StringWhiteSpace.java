package com.cerner;

public class StringWhiteSpace {
    public static void main(String args[]) {
        String s = "He l  l o w o   r l d";
        s = s.replaceAll("\\s+", "");
        System.out.println(s);
    }
}
