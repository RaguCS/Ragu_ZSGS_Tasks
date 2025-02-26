package Practices;

import java.util.ArrayList;
import java.util.List;

public class LGString {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        return list;
    }

    public static void main(String[] args) {
        LGString lgString=new LGString();
        System.out.println(lgString.getHappyString(3,9));
    }
    public String getHappyString(int n, int k) {
        ArrayList<String> res=new ArrayList<>();
        findHappyString(k,n,' ',new StringBuilder(),res);
        return res.get(0);
    }
    public void findHappyString(int k,int n, char ch,StringBuilder sb,ArrayList<String> res) {
        if(sb.length()==n&&--k==0){
            res.add(sb.toString());
                return;
        }
        for(int i=0;i<3&&sb.length()<n;i++){
            char c=(char) (97+i);
            if(ch!=c){
                sb.append(c);
                findHappyString(k,n,c,sb,res);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
