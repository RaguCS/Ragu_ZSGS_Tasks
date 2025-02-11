package Task_2;

import java.util.Arrays;

public class Program_19 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        Program_19 obj=new Program_19();
        for(int[] a:obj.rotateLeft(arr)){
            System.out.println(Arrays.toString(a));
        }
    }
    public int[][] rotateLeft(int[][] arr) {
        int n = arr.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[n-j-1][i] = arr[i][j];
            }
        }
        return res;
    }
}
