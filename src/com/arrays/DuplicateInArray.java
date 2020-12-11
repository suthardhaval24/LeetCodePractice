package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateInArray {
    public static void main(String[] args) {
        int a[] = {12,11,40,12,5,6,5,12,11};
        List<Integer> ans = findDuplicate(a);
        for(int b:ans){
            System.out.println(b);
        }
    }

    private static List<Integer> findDuplicate(int a[]){
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
