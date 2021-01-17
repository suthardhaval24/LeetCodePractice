package com.problems;

public class ReverseVowel {
    public static void main(String[] args) {
        String s =  "aA";
        ReverseVowel rv = new ReverseVowel();
        String ans =  rv.reverseVowels(s);
        System.out.println(ans);
    }

    private  String reverseVowels(String s){
        int left = 0;
        int right = s.length()-1;
        char str[] = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(left<right){
            if(vowels.contains(str[left]+"")) {
                if (vowels.contains(str[right]+"")) {
                    char temp = str[left];
                    str[left] = str[right];
                    str[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            }
            else {
                left++;
            }
        }
        return  String.copyValueOf(str);
    }
}
