package Task_2;

import java.util.Arrays;

public class Program_16 {
    public static void main(String[] args) {
        Program_16 p = new Program_16();
        System.out.println(Arrays.toString(p.mergeArray(new int[]{2,4,7,5,9,10},new int[]{2,3,4,5,6,8})));

    }
    public int[] mergeArray(int[] arr1, int[] arr2) {
        int len=arr1.length + arr2.length;
        int[] arr = new int[len];
        int i = 0, j = 0, k = 0;
        while (i<arr1.length&&j<arr2.length) {
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i++];
            } else if ( arr1[i] == arr2[j]) {
                arr[k]=arr1[i++];
                j++;
            }else if( arr1[i] > arr2[j]) {
                arr[k]=arr2[j++];
            }
            k++;
        }
        while (i<arr1.length)
            arr[k++]=arr1[i++];
        while (j<arr2.length)
            arr[k++]=arr2[j++];
        return arr;
    }
}
