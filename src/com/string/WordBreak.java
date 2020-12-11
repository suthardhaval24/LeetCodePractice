package com.string;

import java.util.*;

/**
 * Leetcode Medium
 * DP: o(n^2)
 * TIme Complexity :
 */

public class WordBreak {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> dict = new ArrayList<>();
        dict.add("a");
        dict.add("aa");
        dict.add("aaa");
        dict.add("aaaa");
        dict.add("aaaa");
        dict.add("aaaaa");
        dict.add("aaaaaa");
        dict.add("aaaaaaa");
        dict.add("aaaaaaaa");
        boolean ans = wordBreak(s, dict);
        System.out.println(ans);
    }


    private static boolean wordBreak(String s, List<String> dict) {
        boolean dp[] = new boolean[s.length() + 1];
        Set<String> set = new HashSet<>();
        set.addAll(dict);
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if (dp[i]) break;
            }
        }

        return dp[s.length()];
    }


//    private static boolean wordBreak(String s, List<String> dict) {
//        if(s == null || s.length() == 0 || dict == null || dict.size() == 0){
//            return false;
//        }
//        Map<String, Boolean> dp = new HashMap<>();
//        Set<String> set = new HashSet<>();
//        for (String l : dict) {
//            set.add(l);
//        }
//        return dfs(s, dict, set, dp);
//    }

//    private static boolean dfs(String s, List<String> dict, Set<String> set, Map<String, Boolean> dp) {
//        if (s.isEmpty()) {
//            return true;
//        }
//
//        for (int i = 1; i <= s.length(); i++) {
//            if (set.contains(s.substring(0, i)) &&
//                    dfs(s.substring(i, s.length()), dict, set, dp)) {
//                dp.put(s.substring(i, s.length()), true);
//                return true;
//            }
//        }
//        dp.put(s, false);
//        return false;
//    }
}
