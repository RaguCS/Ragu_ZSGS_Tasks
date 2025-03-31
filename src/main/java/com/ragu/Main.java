package com.ragu;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

//    public static int maximumGap(int[] nums) {
//        if (nums == null || nums.length < 2) {
//            return 0;
//        }
//
//        int n = nums.length;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        // Find the minimum and maximum values in the array
//        for (int num : nums) {
//            min = Math.min(min, num);
//            max = Math.max(max, num);
//        }
//
//        // If all numbers are the same, the gap is 0
//        if (min == max) {
//            return 0;
//        }
//
//        // Calculate the bucket size and number of buckets
//        int bucketSize = (int) Math.ceil((double) (max - min) / (n - 1));
//        int bucketCount = (max - min) / bucketSize + 1;
//
//        // Create buckets to store the minimum and maximum values in each bucket
//        int[] bucketMin = new int[bucketCount];
//        int[] bucketMax = new int[bucketCount];
//        for (int i = 0; i < bucketCount; i++) {
//            bucketMin[i] = Integer.MAX_VALUE;
//            bucketMax[i] = Integer.MIN_VALUE;
//        }
//
//        // Place each number in the corresponding bucket
//        for (int num : nums) {
//            int bucketIndex = (num - min) / bucketSize;
//            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
//            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
//        }
//
//        // Find the maximum gap between successive non-empty buckets
//        int maxGap = 0;
//        int prevMax = min;
//        for (int i = 0; i < bucketCount; i++) {
//            if (bucketMin[i] == Integer.MAX_VALUE) {
//                continue; // Skip empty buckets
//            }
//            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
//            prevMax = bucketMax[i];
//        }
//
//        return maxGap;
//    }
public int findMin(int[] nums) {
    int start=0,end=nums.length-1;
    while(start<end){
        int mid=start+(end-start)/2;
        if(nums[end]<nums[mid]){
            start=mid+1;
        }else{
            end=mid;
        }
    }
    return nums[start];

}
    public int[] vowelStrings(String[] words, int[][] queries) {
    int[] count=new int[words.length+1];
    int total=0;
    String pre="",suf="",vowels="aeiou";
    for(int i=0;i<words.length;i++){
        pre=String.valueOf(words[i].charAt(0));
        suf=String.valueOf(words[i].charAt(words[i].length()-1));
        if(vowels.contains(pre)&&vowels.contains(suf)){
            total++;
        }
        count[i+1]=total;
    }

        System.out.println(Arrays.toString(count));
    int[] result=new int[queries.length];
    for(int i=0;i<queries.length;i++){
        result[i]=count[queries[i][1]+1]-count[queries[i][0]];
    }
    return result;
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        recursive("", 0, 0, s, ans);
        return ans;
    }

    void recursive(String path, int index, int dots, String str, List<String> ans) {
        if (dots > 4) return;
        if (dots == 4 && index >= str.length()) {
            ans.add(path.substring(0,path.length()-1));
            return;
        }
        for (int length = 1; length <= 3 && index + length <= str.length(); length++) {
            String num = str.substring(index, index + length);
            if (num.charAt(0) == '0' && length != 1) break;
            else if (Integer.parseInt(num) <= 255) {
                recursive( path + str.substring(index, index + length) + ".", index + length,dots + 1, str, ans);
            }
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> res=new ArrayList<>();
        int[] used=new int[n];
        for(int i=0;i<n;i++){
            if(used[i]==1)continue;
            used[i]=1;
            HashSet<Character> hash=strs[i].chars().mapToObj(c->(char)c).collect(Collectors.toCollection(HashSet::new));
            List<String> ans=new ArrayList<>();
            ans.add(strs[i]);
            for(int j=0;j<n;j++){
                if(used[j]==1)continue;
                if(hash.equals(strs[j].chars().mapToObj(c->(char)c).collect(Collectors.toCollection(HashSet::new)))){
                    ans.add(strs[j]);
                    used[j]=1;
                }
            }
            res.add(ans);

        }
    return res;
    }


public static void main(String[] args) {
    String s="25525511135";
//    System.out.println(s.compareTo());
    System.out.println(new Main().restoreIpAddresses(s));

    }
    public List<String> generateParentheses(int n){
    List<String> list=new ArrayList<>();
    bactrack(n,0,0,new StringBuilder(),list);
    return list;
    }
    public void bactrack(int n,int open,int close,StringBuilder sb,List<String> list){
    if (sb.length()==(n*2)){
       list.add(sb.toString());
       return;
    }
    if (open<n){
        sb.append('(');
        bactrack(n,open+1,close,sb,list);
        sb.deleteCharAt(sb.length()-1);
    }
    if (close<open){
        sb.append(')');
        bactrack(n,open,close+1,sb,list);
        sb.deleteCharAt(sb.length()-1);
    }
    }



    public static int maximumGap(int[] nums) {
        if(nums==null||nums.length<2){
            return 0;
        }
        int max=0,min=0;
        for(int a:nums){
            max=Math.max(max,a);
            min=Math.min(min,a);
        }
        int[] count=new int[(max-min)+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]-min]++;
        }
        int maxDiff=0,diff=1;
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                maxDiff=Math.max(maxDiff,diff);
                diff=1;
            }else {
                diff++;
            }
        }
        return maxDiff;
    }

}