package com.string;

/*
Leetcode Medium
 */

public class ValidateIPAddress {
    public static void main(String[] args) {
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";

        if(validateIPv4(IP)){
            System.out.println("IP V4");
        }
        else if(validateIPv6(IP)){
            System.out.println("IP V6");
        }
        else{
            System.out.println("Not Valid IP");
        }
    }

    public static boolean validateIPv4(String IP){
        String[] str = IP.split("\\.");
        // Check if String length is less thn 4
        if(str.length != 4) return false;
        // Check if last char is not .
        if(IP.charAt(IP.length()-1) == '.')return false;
        for(int i = 0; i < str.length; i++){
            // Try to convert string into the number
            try{
                int number = Integer.parseInt(str[i]);
                //check if number is greater than 255
                if(number > 255){
                    return false;
                }
                //check if number is less thn 10 and have leading zero
                if((number < 10 && str[i].length()>1) || (number < 100 && str[i].length()>2) ){
                    return false;
                }
            }
            // catch the exception is string is not converted to number i.e. in case of invalid IPv4
            catch (Exception e){
                return false;
            }
        }
        return true;
    }

    public static boolean validateIPv6(String IP){
        String[] str = IP.split(":");
        // Check if String length is less thn 8
        if(str.length != 8) return false;
        // Check if last char is not :
        if(IP.charAt(IP.length()-1) == ':')return false;
        for(int i = 0; i < str.length; i++){
            String currentStr = str[i].toLowerCase();
            if(currentStr.length() >4 || currentStr.length() < 1) return false;
            int count = 0;
            for(int j = 0; j < currentStr.length(); j++){
                char c = currentStr.charAt(j);
                if( ((c >= 48 && c<= 57) || (c >= 97 && c <= 102 ))){
                    if(c == 48){
                        count++;
                    }else if(count  == 4 ){
                        return false;
                    }
                }
                else return false;
            }

        }
        return true;
    }

}
