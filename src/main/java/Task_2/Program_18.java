package Task_2;

import java.util.Arrays;

public class Program_18 {
    public static void main(String[] args) {
        Program_18 p=new Program_18();
        System.out.println(Arrays.toString(p.alterSort(new int[]{9, 1, 8, 3, 7, 4, 6, 5})));
    }
    public int[] alterSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+2;j<arr.length;j+=2){
                if(i%2==1){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }else {
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        return arr;
    }
}
