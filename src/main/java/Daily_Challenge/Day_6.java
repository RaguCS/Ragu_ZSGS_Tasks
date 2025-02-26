package Daily_Challenge;

import java.util.ArrayList;
import java.util.List;

public class Day_6 {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length<=0)return new ArrayList<>();
        List<String> list=new ArrayList<>();
        int low=nums[0],up=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]-1){
                if(up==low)
                    list.add(String.valueOf(low));
                else{
                    String s=""+low+"->"+up;
                    list.add(s);
                }
                low=nums[i];
            }
            up=nums[i];
        }
        if(up==low)
            list.add(String.valueOf(low));
        else{
            String s=""+low+"->"+up;
            list.add(s);
        }
        return list;
    }
}
