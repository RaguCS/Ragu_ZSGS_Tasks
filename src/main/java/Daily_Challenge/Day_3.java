package Daily_Challenge;

import java.util.Arrays;

public class Day_3 {
    public static void main(String[] args) {
        Day_3 d = new Day_3();
        System.out.println(Arrays.toString(d.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] hash=new int[101];
        int[] res=new int[n];
        for(int num:nums)
            hash[num]++;

        for(int i=1;i<hash.length;i++){
            hash[i]=hash[i]+hash[i-1];
        }

        for(int i=0;i<n;i++){
            if(nums[i]==0)
                res[i]=0;
            else
                res[i]=hash[(nums[i]-1)];
        }
        return res;
    }
}
