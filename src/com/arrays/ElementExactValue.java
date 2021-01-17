package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class ElementExactValue {
    private int a;

    public static void main(String[] args) {
        HashMap<String, String> results = new HashMap();
        results.put("FirstYear", "Pass");
        results.put("SecondYear", "Fail");
        results.put("ThirdYear", "Pass");
        for (String result : results.keySet()) {
            System.out.println(result + " => " + results.get(result));
        }
    }
}
