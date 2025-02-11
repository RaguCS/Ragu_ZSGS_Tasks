package Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_30 {
    public static void main(String[] args) {
        Program_30 p=new Program_30();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(p.diaArray(arr));
    }
    public List<List<Integer>> diaArray(int[][] arr){
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        for (int i=0;i<n;i++){
            helper(arr,i,0,new ArrayList<>(),res);
            if(i==n-1){
                for (int j=1;j<n;j++){
                    helper(arr,i,j,new ArrayList<>(),res);
                }
            }
        }
        return res;
    }
public void helper(int[][] arr,int row,int col,List<Integer> ans,List<List<Integer>> res){
        if(row<0||col>=arr[0].length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[row][col]);
        helper(arr,row-1,col+1,ans,res);
        ans.remove(ans.size()-1);
}
}

