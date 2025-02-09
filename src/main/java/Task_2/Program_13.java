package Task_2;

public class Program_13 {
    public static void main(String[] args) {
        Program_13 p = new Program_13();
        System.out.println(p.smallestInArray(new int[]{5,4,3,2,1,-2}));
    }
    public int smallestInArray(int[] arr) {
        int smallest =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest==Integer.MAX_VALUE?-1:smallest;
    }
}
