package Task_2;

import java.util.Arrays;

public class Program_17 {
    public static void main(String[] args) {
        Program_17 p=new Program_17();
        System.out.println(Arrays.toString(p.reArrange(new int[]{1,3,4,8,9,5,6,7})));
    }
    public int[] reArrange(int[] arr){
        Arrays.sort(arr);
        int[] res=new int[arr.length];
        int i=0,j=arr.length-1,k=0;
        while (i<=j){
            res[k+1]=arr[i++];
            res[k]=arr[j--];
            k+=2;
        }
        return res;
    }
}
