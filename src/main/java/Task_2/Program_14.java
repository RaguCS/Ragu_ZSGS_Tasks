package Task_2;

import java.util.Arrays;

public class Program_14 {
    public static void main(String[] args) {
        Program_14 p = new Program_14();
        System.out.println(Arrays.toString(p.copyArray(new int[]{6,3,9,4,5,6,8,1},new int[10])));
    }
    public int[] copyArray(int[] oldArr, int[] newArr) {
        for (int i = 0; i < oldArr.length&&i<newArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}
