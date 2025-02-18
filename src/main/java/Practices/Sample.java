package Practices;

import java.util.Arrays;

public class Sample {
    String s;

    public static void main(String[] args) {
        Sample sample = new Sample();
        String a1="IIIDIDDD";
        System.out.println(a1);
        System.out.println(sample.smallestNumber(a1));
        System.out.println(123549876);
    }
    public String smallestNumber(String pattern) {
        int[] arr=new int[pattern.length()];
        int[] visited=new int[10];
        arr[0]=1;
        visited[1]=1;
        backtrack(pattern,0,arr,visited);
        System.out.println(Arrays.toString(arr));
        return s;
    }
    public boolean backtrack(String patt,int index,int[] ans,int[] visited) {
        if(index>=patt.length()){
            return true;
        }
        for (int i=1;i<=9;i++){
            if(visited[i]==0&&isValid(patt.charAt(index),index,ans,i)){
                ans[index]=i;
                visited[i]=1;
                if(backtrack(patt,index+1,ans,visited)){
                    return true;
                }
                visited[i]=0;
                ans[index]=0;
            }
        }
        return false;

    }
    public boolean isValid(char c,int i,int[] ans,int num){
        if(i==0||(c=='I'&&num>ans[i-1])||( c == 'D' && num < ans[i - 1]))
            return true;

        return false;
    }
}
