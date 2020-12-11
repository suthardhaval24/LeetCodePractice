package com.cerner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReverseAndAdd {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            //to count iteration
            int count = 0;
            StringBuilder sb = new StringBuilder();
            //if it is already palindrome
            if (checkPalindrome(num)) {
                sb.append(count).append(" ").append(num);
                System.out.println(sb.toString());
            } else {
                //till number is not palindrome
                while (!checkPalindrome(num)) {
                    int reverse = reverseNumber(num);
                    int sum = num + reverse;
                    num = sum;
                    count++;
                }
                sb.append(count).append(" ").append(num);
                System.out.println(sb.toString());
            }
        }
    }

    //Method To Check For Palindrome
    static boolean checkPalindrome(int number) {
        int reverse = reverseNumber(number);
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }

    //Method To Reverse A Number
    static int reverseNumber(int number) {
        int reverse = 0;
        int rem = 0;
        while (number != 0) {
            rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        return reverse;
    }
}
