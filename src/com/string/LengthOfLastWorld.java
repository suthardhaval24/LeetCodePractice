package com.string;

public class LengthOfLastWorld {
    public static void main(String[] args) {
        String s = "a";
        int ans = lengthoOfLastWord(s);
        System.out.println(ans);
    }

    private static int lengthoOfLastWord(String s) {
        String word[] = s.split("\\s+");
        if (word.length == 0) {
            return 0;
        } else {
            return word[word.length - 1].length();
        }
    }
}
