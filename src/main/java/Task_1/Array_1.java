package Task_1;

public class Array_1 {
    public boolean firstLast6(int[] nums) {
        return nums[0]==6||nums[nums.length-1]==6;
    }
    public boolean sameFirstLast(int[] nums) {
        return nums.length>0&&nums[0]==nums[nums.length-1];
    }
    public int[] makePi() {
        return new int[]{3,1,4};
    }
    public boolean commonEnd(int[] a, int[] b) {
        return a[0]==b[0]||a[a.length-1]==b[b.length-1];
    }
    public int sum3(int[] nums) {
        int sum=0;
        for(int num:nums)
            sum+=num;

        return sum;
    }
    public int[] rotateLeft3(int[] nums) {
        int n=nums[0];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=n;
        return nums;
    }
    public int[] reverse3(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            int n=nums[i];
            nums[i++]=nums[j];
            nums[j--]=n;
        }
        return nums;
    }
    public int[] maxEnd3(int[] nums) {
        int max=Math.max(nums[0],nums[2]);
        for(int i=0;i<nums.length;i++)
            nums[i]=max;
        return nums;
    }
    public int sum2(int[] nums) {
        if(nums.length<2)
            return nums.length>0?nums[0]:0;
        else
            return nums[0]+nums[1];
    }
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1],b[1]};
    }
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0],nums[nums.length-1]};
    }
    public boolean has23(int[] nums) {
        for(int num:nums){
            if(num==2||num==3)return true;
        }
        return false;
    }
    public boolean no23(int[] nums) {
        for(int num:nums){
            if(num==2||num==3)return false;
        }
        return true;
    }
    public int[] makeLast(int[] nums) {
        int len=nums.length*2;
        int[] n=new int[len];
        n[len-1]=nums[nums.length-1];
        return n;
    }
    public boolean double23(int[] nums) {
        if(nums.length>1)return (nums[0]==2||nums[1]==3)&&nums[0]==nums[1];
        else
            return false;
    }
    public int[] fix23(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==2&&nums[i+1]==3)
                nums[i+1]=0;
        }
        return nums;
    }
    public int start1(int[] a, int[] b) {
        if(a.length>0&&a[0]==1)
            return b.length>0&&b[0]==1?2:1;
        else
            return b.length>0&&b[0]==1?1:0;
    }
    public int[] biggerTwo(int[] a, int[] b) {
        return (a[0]+a[1])<(b[0]+b[1])?b:a;
    }
    public int[] makeMiddle(int[] nums) {
        int mid=nums.length/2;
        return new int[]{nums[mid-1],nums[mid]};
    }
    public int[] plusTwo(int[] a, int[] b) {
        int[] n=new int[a.length+b.length];
        int index=0;
        for(int n1:a){
            n[index++]=n1;
        }
        for(int n2:b){
            n[index++]=n2;
        }
        return n;
    }
    public int[] swapEnds(int[] nums) {
        int n=nums[0],len=nums.length;
        nums[0]=nums[len-1];
        nums[len-1]=n;
        return nums;
    }
    public int[] midThree(int[] nums) {
        int mid=nums.length/2;
        return new int[]{nums[mid-1],nums[mid],nums[mid+1]};
    }
    public int maxTriple(int[] nums) {
        int len=nums.length;
        int mid=len/2;
        if(len>2)
            return Math.max(nums[0],Math.max(nums[mid],nums[len-1]));
        else
            return len>1?Math.max(nums[0],nums[len-1]):nums[0];
    }
    public int[] frontPiece(int[] nums) {
        int len=nums.length;
        if(len>1)
            return new int[]{nums[0],nums[1]};
        else
            return len>0?new int[]{nums[0]}:new int[]{};
    }
    public boolean unlucky1(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            if((i<2||i>=len-2)&&nums[i]==1&&nums[i+1]==3)
                return true;
        }
        return false;
    }
    public int[] make2(int[] a, int[] b) {
        int[] n=new int[2];
        if(a.length>1){
            n[0]=a[0];
            n[1]=a[1];
        }else if(a.length==1){
            n[0]=a[0];
            n[1]=b[0];
        }else{
            n[0]=b[0];
            n[1]=b[1];
        }
        return n;
    }
    public int[] front11(int[] a, int[] b) {
        if(a.length>0&&b.length>0)
            return new int[]{a[0],b[0]};
        else
            return a.length==0&&b.length==0?new int[]{}:a.length==0?new int[]{b[0]}:new int[]{a[0]};
    }

}
