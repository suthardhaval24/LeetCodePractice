package com.arrays;

public class CountNumberOfTeams {
    public static void main(String[] args) {
        int rating[] = {1,2,3,4};
        int teams = numTeams(rating);
        System.out.println(teams);
    }

    private static int numTeams(int rating[]){
        int team = 0;
        for(int i=0;i<rating.length-2;i++)
            for(int j=i+1;j<rating.length-1;j++)
                for(int k=j+1;k<rating.length;k++)
                    if((rating[i]>rating[j]) && (rating[j]>rating[k]) || (rating[i]<rating[j]) && (rating[j]<rating[k])){
                        team++;
                    }
        return  team;
    }
}
