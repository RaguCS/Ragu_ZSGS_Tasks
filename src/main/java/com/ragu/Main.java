package com.ragu;

public class Main {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int a=sc.nextInt();
//            int[] arr=new int[a];
//            for(int i=0;i<a;i++){
//                arr[i]=sc.nextInt();
//            }
//
//        }
    }
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        return permute(0, arr);
    }
    public int permute(int start, char[] arr) {
        if(start == arr.length) return 0;
        int ans = 0;
        for(int i=start; i<arr.length; i++) {
            if(!isPermutedBefore(start, i-1, arr[i], arr)) {
                swap(start, i, arr);
                ans += 1+permute(start+1, arr);
                swap(start, i, arr);
            }
        }
        return ans;
    }
    public boolean isPermutedBefore(int i, int j, char ch, char[] arr) {
        while(i<=j)
            if(arr[i++] == ch) return true;
        return false;
    }
    public void swap(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}