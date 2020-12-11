package com.string;

public class Validate {
    public static void main(String[] args) {
        String abc[] = {"HELP","Dhaval","-1"};
        int ans = validate(abc);
        System.out.println(ans);
    }

    public static int validate(String args[]) {
        int ans = 0;
        boolean flag = false;
        if (args == null || args.length == 0) {
            return -1;
        }

        if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
            return 1;
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("help")) {
                ans = 1;
                flag=true;
            } else {
                try {
                    int a = Integer.parseInt(args[i]);
                    if (a >= 10 && a <= 100) {
                        ans = 0;
                    }else{
                        ans = -1;
                        flag=false;
                    }
                } catch (Exception e) {
                    if (args[i].length() >= 3 || args[i].length() <= 10) {
                        ans = 0;
                    } else {
                        return -1;
                    }
                }
            }
        }
        return (flag ? 1 : ans);
    }
}
