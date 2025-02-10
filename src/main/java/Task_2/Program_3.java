package Task_2;

import java.util.ArrayList;
import java.util.List;

public class Program_3 {
    public static void main(String[] args) {
        Program_3 p = new Program_3();
        System.out.println(p.splitGroups(20));

    }
    public List<List<Integer>> splitGroups(int num){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=1;i<=4;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=i;j<=num;j+=4){
                list.add((100)+j);
            }
            res.add(list);
        }
        return res;
    }
}
