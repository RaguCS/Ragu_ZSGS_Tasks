package com.ragu;

public class Main {
    static String clean(String identifier) {
        identifier=identifier.replaceAll(" ","_");
        identifier=identifier.replaceAll("4","a");
        identifier=identifier.replaceAll("3","e");
        identifier=identifier.replaceAll("0","o");
        identifier=identifier.replaceAll("1","l");
        identifier=identifier.replaceAll("7","t");
        identifier=identifier.replaceAll("[^a-z A-Z _-] ","");
        StringBuilder sb=new StringBuilder(identifier);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='-'&&i<sb.length()-1&&sb.charAt(i+1)!='_'){
                String s=""+sb.charAt(i+1);
                s=s.toUpperCase();
                sb.setCharAt(i+1,s.charAt(0));
                sb.deleteCharAt(i);

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="a-bc!¡.";

        System.out.println(s.replaceAll("[^a-z A-Z_-]",""));
//        System.out.println(clean(s));
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