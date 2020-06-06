package com.problems;
/*
Leetcode easy
 */

import java.util.Iterator;
import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
        String [] ops = {"5","2","C","D","+"};
        int sum = calPoints(ops);
        System.out.println(sum);
    }

    private  static int calPoints(String [] ops){
        Stack<String> stack  = new Stack<>();
        int sum=0;
        for(String s: ops){
            if(s.equals("C")) {
                int x = Integer.parseInt(stack.pop());
                sum -= x;
            }
            else if(s.equals("D")){
                int p = Integer.parseInt(stack.peek());
                stack.push(String.valueOf(2*p));
                sum += 2*p;

            }
            else if(s.equals("+")){
                int a = Integer.parseInt(stack.pop()), b= Integer.parseInt(stack.peek());
                sum += a+b;
                stack.push(String.valueOf(a));
                stack.push(String.valueOf(a+b));
            }
            else{
                int x= Integer.parseInt(s);

                stack.push(String.valueOf(x));
                sum += x;
            }
        }
        return sum;
    }
}
