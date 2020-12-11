package com.microsoft;

class ThreeConsucutiveChracter {

    public static int solution(String s) {
        int moves = 0;
        for (int i = 0; i < s.length(); i++) {
            int runLength = 1;
            for (; i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1); i++) {
                runLength++;
            }
            moves += runLength / 3;
        }
        return moves;
    }

    public static void main(String[] args) {
        test(solution("baaaaa"), 1);
        test(solution("baaaaaa"), 2);
        test(solution("baaaab"), 1);
        test(solution("baaabbaabbba"), 2);
        test(solution("baabab"), 0);
        test(solution("bbaabbaabbabab"), 0);
    }

    private static void test(int actual, int expected) {
        if (actual == expected) {
            System.out.println("PASSED!");
        } else {
            System.out.println(String.format("FAILED! Expected %d, but got: %d", expected, actual));
        }
    }
}
