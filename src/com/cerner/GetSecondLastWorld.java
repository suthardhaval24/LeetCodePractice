package com.cerner;

public class GetSecondLastWorld {
    public static void main(String args[]) {
        String word = "Hello Dhaval! How Are you doing?";
        String[] w = word.split("\\s");
        System.out.println(w[w.length-2]);
    }
}
