package Daily_Challenge;

import java.util.Stack;

public class Day_7 {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                s1.push(c);
            }
            else if(!s1.isEmpty()&&c==')'&&s1.peek()=='('){
                s1.pop();
            } else if(!s1.isEmpty()&&c==']'&&s1.peek()=='['){
                s1.pop();
            } else if(!s1.isEmpty()&&c=='}'&&s1.peek()=='{'){
                s1.pop();
            }else{
                return false;
            }

        }
        return s1.isEmpty();

    }
}
