package Task_2;

import java.util.ArrayList;

public class Program_15 {
    public static void main(String[] args) {
        Program_15 p = new Program_15();
        System.out.println(p.dupArr(new int[]{1,5,1,6,8,9,5,1,6,7,5}));
    }
    public ArrayList<Integer> dupArr(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i]))
                continue;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}
