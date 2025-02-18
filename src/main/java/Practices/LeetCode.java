package Practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class LeetCode {
    HashSet<String> st=new HashSet<>();
    public int numTilePossibilities(String tiles) {
        combi(tiles.toCharArray(),0,new StringBuilder());
        int count=0;
        for (String s : st) {
            if(!s.isEmpty()){
//                count+=permu(s.toCharArray(),new StringBuilder(),new int[s.length()]);
            }
        }
        return count;
    }
    public void combi(char[] s,int i,StringBuilder sb){
        if(i>=s.length){
            st.add(sb.toString());
            return;
        }
        combi(s, i+1, sb);
        sb.append(s[i]);
        combi(s, i+1, sb);
        sb.deleteCharAt(sb.length()-1);

    }
//   public int permu(char[] s,StringBuilder sb,int[] used){
//
//            return;
//
//
//   }

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        if(s == null || s.isEmpty())return 0;
        int count=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    count=Math.max(count,i-stack.peek());
                }

            }
        }
        return count;
    }
}
