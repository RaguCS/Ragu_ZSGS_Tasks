package com.ragu;

import java.util.Arrays;
abstract interface CanSing {
    public boolean eat();
}
 interface CanDance {
    public boolean eat();
    }

 interface InterfaceDemo extends CanSing, CanDance {

}
public class A {

    public int minDistance(String word1, String word2) {
        int length1=word1.length();
        int length2=word2.length();
        int[][] dp=new int [length1][length2];
        for(int[] arr:dp)
            Arrays.fill(arr,-1);
        return DP(word1,word2,length1-1,length2-1,dp);
    }
    public int DP(String s1, String s2, int index1, int index2,int[][] dp) {
        if(index1 <0)
            return index2 +1;
        if(index2 <0)
            return index1 +1;
        if(dp[index1][index2]!=-1)
            return dp[index1][index2];
        if(s1.charAt(index1)==s2.charAt(index2)){
            return dp[index1][index2]=DP(s1,s2, index1 -1, index2 -1,dp);
        }else {
            return dp[index1][index2]=1+Math.min(DP(s1,s2, index1 -1, index2,dp),Math.min(DP(s1,s2, index1, index2 -1,dp),DP(s1,s2, index1 -1, index2 -1,dp)));

        }
    }
}
