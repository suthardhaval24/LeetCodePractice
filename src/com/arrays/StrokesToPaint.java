package com.arrays;

/**
 * DFS
 */

public class StrokesToPaint {
    public static void main(String[] args) {
        char[][] grid = {{'a', 'a', 'b', 'b', 'a'},
                {'a', 'a', 'b', 'b', 'a'},
                {'a', 'a', 'a', 'c', 'b'}};
        System.out.println(getStrokesToPaintDFS(grid));
    }

    private static int getStrokesToPaintDFS(char[][]grid){
        if(grid==null || grid.length==0){
            return 0;
        }

        int res=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!='-'){
                    dfs(grid,i,j,grid[i][j]);
                    res++;
                }

            }
        return res;
    }

    private static void dfs(char[][]grid, int i,int j, char c){
        if(i<0||i>=grid.length || j<0 || j>= grid[0].length || grid[i][j] =='-' || grid[i][j]!=c){
            return;
        }
        grid[i][j]='-';
        dfs(grid,i+1,j,c);
        dfs(grid,i-1,j,c);
        dfs(grid,i,j+1,c);
        dfs(grid,i,j-1,c);
    }
}
