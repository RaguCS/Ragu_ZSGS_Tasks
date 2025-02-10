package Task_2;

import java.util.Arrays;

public class Program_16 {
    public static void main(String[] args) {
        Program_16 p = new Program_16();
        System.out.println(Arrays.toString(p.mergeArray(new int[]{2,4,5,9,10},new int[]{2,3,4,5,6})));

    }
    public int[] mergeArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i<arr1.length&&j<arr2.length&&arr1[i] < arr2[j]) {
                arr[k] = arr1[i++];
            } else if (i<arr1.length&&j<arr2.length&&arr1[j]==arr2[i]) {
                arr[k] = arr2[j++];
            } else {
                arr[k] = arr2[j++];
            }
            k++;
        }
        return arr;
    }
}
