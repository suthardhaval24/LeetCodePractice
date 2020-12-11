package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringInAlphabetical {
    public static void main(String[] args) {
        String s = "Dhaval Girishbhai Suthar";
        s = newString(s);
        System.out.println(s);
    }

    private static String newString(String s) {
        s = s.toLowerCase();
        Set<Character> count = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count.add(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for(char c : count){
            sb.append(c);
        }
        return sb.toString();
    }
}
