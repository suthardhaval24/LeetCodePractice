package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        String A[] =  { "eva","jqw","tyn","jan"};
        int ans = findLength(A);
        System.out.println(ans);
    }

    public static int findLength(String A[]) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        int res = 0;
        for (String s : A) {
            int a = 0, dup = 0;
            for (char c : s.toCharArray()) {
                dup |= a & (1 << (c - 'a'));
                a |= 1 << (c - 'a');
            }
            if (dup > 0) continue;
            for (int i = dp.size() - 1; i >= 0; --i) {
                if ((dp.get(i) & a) > 0) continue;
                dp.add(dp.get(i) | a);
                res = Math.max(res, Integer.bitCount(dp.get(i) | a));
            }
        }
        return res;
    }


//    private static int findLength(String A[]){
//        ArrayList<String> temp = helper(A,0);
//        int len=0;
//        for(int i=0;i<temp.size();i++){
//            len = len > temp.get(i).length() ? len: temp.get(i).length();
//        }
//        return len;
//    }
//
//    static ArrayList<String> helper(String A[], int index){
//        ArrayList<String> fin = new ArrayList<>();
//        fin.add("");
//        if(index == A.length){
//            return fin;
//        }
//
//        ArrayList<String> tmp = helper(A,index+1);
//        ArrayList<String> ret = new ArrayList<>(tmp);
//
//        for(int i=0;i<tmp.size();i++){
//            String test = tmp.get(i)+A[index];
//            if(check(test))
//                ret.add(test);
//        }
//        return ret;
//    }
//
//    static boolean check(String s)
//    {
//        HashSet<Character> a = new HashSet<>();
//
//        for(int i = 0; i < s.length(); i++)
//        {
//            if (a.contains(s.charAt(i)))
//            {
//                return false;
//            }
//            a.add(s.charAt(i));
//        }
//        return true;
//    }
}
