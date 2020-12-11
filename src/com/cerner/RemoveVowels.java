package com.cerner;

public class RemoveVowels {

    public static void main(String args[]) {
        String word = "Hello Dhaval! How Are you doing?";
        char[] temp = word.toCharArray();
        String vowel = "AIEOUaieou";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (!vowel.contains(temp[i] + "")) {
                sb.append(temp[i]);
            }
        }
        System.out.println(sb.toString());
    }
}