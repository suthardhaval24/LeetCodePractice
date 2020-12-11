package com.microsoft;

public class MaximumNumber {
    public static void main(String[] args) {
        int num = 99;
        System.out.println(printMaxNum(num, 5));
    }

    private static int printMaxNum(int num, int digit) {
        String numString = String.valueOf(num);
        String result = null;
        //negative
        if (num < 0) {
            numString = numString.substring(1);
            for (int i = 0; i < numString.length(); i++) {
                if (numString.charAt(i) - '0' > digit) {
                    result = "-" + numString.substring(0, i) + String.valueOf(digit) + numString.substring(i);
                    break;
                }

                if (result == null) {
                    result = "-" + numString + String.valueOf(digit);
                }
            }
            return Integer.parseInt(result);
        }

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) - '0' < digit) {
                result = numString.substring(0, i) + String.valueOf(digit) + numString.substring(i);
                break;
            }
            if (result == null) {
                result =  numString + String.valueOf(digit);
            }
        }
        return Integer.parseInt(result);
    }

}
