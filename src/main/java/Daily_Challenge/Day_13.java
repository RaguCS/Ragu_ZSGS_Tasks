package Daily_Challenge;

public class Day_13 {
    public static void main(String[] args) {
        Day_13 d = new Day_13();
        System.out.println(d.maxAscendingSum(new int[]{3,6,10,1,8,9,9,8,9}));
    }
    public int maxAscendingSum(int[] nums) {
        int max=0,sum=nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]||nums[i-1]==nums[i]){
                max=Math.max(max,sum);
                sum=nums[i];
            }else {
                sum=sum+nums[i];
            }
        }
        return Math.max(max,sum);
    }
}
