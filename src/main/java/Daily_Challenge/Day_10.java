package Daily_Challenge;

public class Day_10 {
    public int jump(int[] nums){
        int jum=0,currend=0,farthest=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==currend) {
                currend = farthest;
                jum++;
            }
        }
        return jum;
//        int n=nums.length;
//        int[] dp=new int[n];
//        Arrays.fill(dp,-1);
//        return canJump(nums,0,dp);
    }
    public int canJump(int[] nums,int index,int[] dp){
        if(index==nums.length-1)return 0;
        if(index>=nums.length)return Integer.MAX_VALUE;;
        if(dp[index]!=-1)return dp[index];
        int val=nums[index];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=val;i++){
            min=Math.min(min,canJump(nums,index+i,dp));
        }
        if(min!=Integer.MAX_VALUE)min++;
        return dp[index]=min;
    }
}
