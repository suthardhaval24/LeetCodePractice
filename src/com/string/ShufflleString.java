package com.string;

public class ShufflleString {
    public static void main(String args[]) {
        String s = "codeleet";
        int indices[] = {4, 5, 6, 7, 0, 2, 1, 3};
        s = restoreString(s, indices);
        System.out.println(s);
    }

    private static String restoreString(String s, int[] indices) {
        char ans[] = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]]= s.charAt(i);
        }
        return new String(ans);
    }
}
