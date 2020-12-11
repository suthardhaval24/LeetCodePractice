package com.cerner;

import java.util.*;

public class StringSort {
    public static void main(String args[]) {
        String s = "Cerner";
        char[] lets = s.toCharArray();//space : o(n)
        Arrays.sort(lets);//Dual pivot quick sort: 0(nlogn)
        for (char c : lets) { //o(n)
            System.out.print(c + " ");
        }
        String sortedString = sortString(s);
        System.out.println(sortedString);
    }

    private static String sortString(String s) {
        List<Character> temp = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.charAt(i));
        }
        Collections.sort(temp, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (char c : temp) {
            sb.append(c);
        }
        return sb.toString();
    }
}
