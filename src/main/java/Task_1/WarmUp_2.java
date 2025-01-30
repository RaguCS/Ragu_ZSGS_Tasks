package Task_1;

public class WarmUp_2 {
    public String stringTimes(String str, int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
            sb.append(str);
        return sb.toString();
    }
    public String frontTimes(String str, int n) {
        if(str.length()>=3)
            str=str.substring(0,3);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(str);
        }
        return sb.toString();
    }
    int countXX(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='x'&&str.charAt(i+1)=='x')count++;
        }
        return count;
    }
    boolean doubleX(String str) {
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='x')return str.charAt(i+1)=='x'?true:false;
        }
        return false;

    }
    public String stringBits(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i+=2){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public String stringSplosion(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                sb.append(str.charAt(j));
            }
        }
        return sb.toString();
    }
    public int last2(String str) {
        int count=0;
        if(str.length()<3)return 0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)==str.charAt(str.length()-2)&&str.charAt(i+1)==str.charAt(str.length()-1))
                count++;
        }
        return count;
    }
    public int arrayCount9(int[] nums) {
        int count=0;
        for(int num:nums){
            if(num==9)count++;
        }
        return count;
    }
    public boolean arrayFront9(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==9&&i<4)return true;
        }
        return false;
    }
    public boolean array123(int[] nums) {
        if(nums.length<3)return false;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==1&&nums[i+1]==2&&nums[i+2]==3)return true;
        }
        return false;
    }
    public int stringMatch(String a, String b) {
        int count=0,len=Math.min(a.length(),b.length());
        for(int i=0;i<len-1;i++){
            if(a.charAt(i)==b.charAt(i)&&a.charAt(i+1)==b.charAt(i+1))count++;
        }

        return count;
    }
    public String stringX(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==0||i==str.length()-1||str.charAt(i)!='x')
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public String altPairs(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i+=4){
            sb.append(str.charAt(i));
            if(i+1<str.length())
                sb.append(str.charAt(i+1));

        }
        return sb.toString();
    }
    public String stringYak(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i+2<str.length()&&str.charAt(i)=='y'&&str.charAt(i+1)=='a'&&str.charAt(i+2)=='k')i+=2;
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public int array667(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==6&&(nums[i+1]==6||nums[i+1]==7))count++;
        }
        return count;
    }
    public boolean noTriples(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count>=3)return false;
            }
            else
                count=1;
        }
        return true;
    }
    public boolean has271(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i+2<nums.length&&nums[i+1]==(nums[i]+5)&&Math.abs((nums[i+2]-(nums[i]-1)))<=2)return true;
        }
        return false;
    }

}
