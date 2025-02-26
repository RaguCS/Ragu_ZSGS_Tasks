package Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {
    public List<String> findWords(char[][] grid, Set<String> words){
        int n=grid.length,m=grid[0].length;
        List<String> list=new ArrayList<String>();
        for (String s:words){
            for (int i=0;i<n;i++){

            }
        }
        return list;
    }
    public boolean isPresent(String s,char[][] grid,int row,int col,int dr,int dc){
        if(s.isEmpty())
            return true;
        if(row<0||col<0||row>= grid.length||col>=grid[0].length||s.charAt(0)!=grid[row][col])
            return false;
        if(isPresent(s.substring(1),grid,row+dr,col+dc,dr,dc)){
            return true;
        }
        return false;
    }

    public int canJump(int[] nums){
        int jump=0,currend=0,farthest=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==currend) {
                currend = farthest;
                jump++;
            }
        }
        return jump;
    }

}
