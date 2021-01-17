package com.backTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthiesis {
    public static void main(String[] args) {
        List<String> str = generateParanthesis(3);
        for(String s: str){
            System.out.println(s);
        }
    }

    private static List<String> generateParanthesis(int n){
        List<String> res = new ArrayList<>();
        backTrack(res,"",0,0,n);
        return res;
    }

    private static void backTrack(List<String> res, String str, int open, int close, int max){
        if(str.length() == max*2){
            res.add(str);
            return;
        }

        if(open<max){
            backTrack(res,str+"(",open+1, close, max);
        }

        if(close<open){
            backTrack(res,str+")",open, close+1, max);
        }
    }
}
