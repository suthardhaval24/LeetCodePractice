package com.cerner;

public class GraphCordination {
    public static void main(String args[]){
        String p1 = "0 0";
        String p2 = "0 1";
        String ans = calculateDirection(p1,p2);
        System.out.println(ans);
    }

    private static String calculateDirection(String p1, String p2){
        String a[]  = p1.split("\\s");
        int x1 = Integer.parseInt(a[0]);
        int y1 = Integer.parseInt(a[1]);
        String b[]  = p2.split("\\s");
        int x2 = Integer.parseInt(b[0]);
        int y2 = Integer.parseInt(b[1]);

        StringBuilder sb =  new StringBuilder();
        if(y2>y1){
            sb.append("North");
        }
        else if(y1>y2){
            sb.append("South");
        }
        else{
            sb.append("here");
        }

        if(x2>x1){
            sb.append("East");
        }
        else if(x1>x2){
            sb.append("West");
        }
        else{
            sb.append("here");
        }

        return sb.toString();

    }
}
