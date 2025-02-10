package Task_1;

import java.util.Arrays;

public class Array_2 {
    public int countEvens(int[] nums) {
        int count=0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i]%2==0) count++;
        }
        return count;
    }
    public int bigDiff(int[] nums) {
        int min =nums[0];
        int max =nums[0];
        for(int i=1; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return max-min;
    }
    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=1; i < nums.length-1; i++) {
            sum = sum+nums[i];
        }
        return sum/(nums.length-2);
    }
    public int sum13(int[] nums) {
        int sum=0;
        for(int i =0; i<nums.length; i++) {
            if(nums[i] ==13) {
                if(i+1 <nums.length) {
                    i = i+1;
                }
            }
            else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    public int sum67(int[] nums) {
        int sum=0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 6) {
                while(nums[i] != 7) {
                    i++;
                }
            }
            else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    public boolean has22(int[] nums) {
        int fl=0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 2 && i+1 < nums.length && nums[i+1] == 2) {
                return true;
            }
            else {
                fl=0;
            }
        }
        return (fl==1);
    }
    public boolean sum28(int[] nums) {
        int sum=0;
        for(int i=0; i <nums.length; i++) {
            if(nums[i] ==2) {
                sum = sum +2;
            }
        }
        return(sum == 8);
    }
    public boolean more14(int[] nums) {
        int countOne = 0;
        int countFour =0;
        for(int i =0; i < nums.length; i++) {
            if(nums[i] == 1) countOne++;
            if(nums[i] == 4) countFour++;
        }
        return ( countOne > countFour);
    }
    public int[] fizzArray(int n) {
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
            nums[i] = i;
        }
        return nums;
    }
    public boolean only14(int[] nums) {
        for(int i=0; i <nums.length; i++) {
            if(nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }
    public String[] fizzArray2(int n) {
        String[] str = new String[n];
        for(int i=0; i < str.length; i++) {
            str[i] = String.valueOf(i);
        }
        return str;
    }
    public boolean no14(int[] nums) {
        boolean ones = false, fours = false;

        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 1) {
                ones = true;
            }
            else if(nums[i] == 4) {
                fours = true;
            }
        }
        return(ones == false || fours == false);

    }
    public boolean isEverywhere(int[] nums, int val) {
        if(nums.length <= 1) return true;
        boolean cn = false;;
        for(int i=0; i < nums.length-1; i++) {
            if(nums[i] == val || nums[i+1] == val) {
                cn =true;
            }
            else {
                return false;
            }
        }
        return (cn);
    }
    public boolean either24(int[] nums) {
        boolean twos = false, fours = false;
        for(int i = 0; i < nums.length-1;i++) {
            if(nums[i] == 2 && nums[i+1] == 2) twos = true;
            if(nums[i] == 4 && nums[i+1] == 4) fours = true;
        }
        if(!twos && !fours || twos && fours) return false;
        return true;
    }
    public int matchUp(int[] nums1, int[] nums2) {
        int count =0;
        for(int i=0; i<nums1.length; i++) {
            int z = Math.abs(nums1[i]-nums2[i]);
            if( z > 0 && z <=2) count++;
        }
        return count;
    }
    public boolean has77(int[] nums) {
        int l = nums.length;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 7) {
                if(i+1 < l && nums[i+1] ==7) {
                    return true;
                }
                else if((i+2 < l && nums[i+2] ==7)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean has12(int[] nums) {
        boolean one = false;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                one = true;
            }
            if(one && nums[i] ==2) {
                return true;
            }
        }
        return false;
    }
    public boolean modThree(int[] nums) {
        int countOdd =0, countEven =0;
        for(int i=0; i<nums.length-2; i++) {
            if(nums[i]%2 == 0 && nums[i+1]%2 == 0 && nums[i+2]%2 ==0) {
                return true;
            }

            else if(nums[i]%2 == 1 && nums[i+1]%2 == 1 && nums[i+2]%2 == 1) {
                return true;
            }

        }
        return false;
    }
    public boolean haveThree(int[] nums) {
        int countThree = 0;
        if(nums.length > 1 && nums[0] == 3 && nums[1]!=3) countThree++;
        for(int i=1; i < nums.length; i++) {

            if(nums[i] ==3 && nums[i-1] != 3) {
                countThree++;
            }
        }

        return (countThree  == 3);


    }
    public boolean twoTwo(int[] nums) {

        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] != 2)
                continue;
            if (i >= 1 && nums[i-1] == 2)
                continue;
            if (i < (nums.length-1) && nums[i+1] == 2)
                continue;
            return false;
        }
        return true;

    }
    public boolean sameEnds(int[] nums, int len) {
        for(int i=0, j = nums.length-len; i < len; i++, j++) {
            if(nums[i] == nums[j]) {

            }
            else {
                return false;
            }
        }
        return true;
    }
    public boolean tripleUp(int[] nums) {
        for(int i=0; i < nums.length-2; i++) {
            if(nums[i]+ 1 == nums[i+1]  && nums[i+1]+1 == nums[i+2] ) {
                return true;
            }
        }
        return false;
    }
    public int[] fizzArray3(int start, int end) {
        int[] nums = new int[end-start];
        for(int i=0; i <nums.length; i++) {
            nums[i] = start+i;
        }
        return nums;
    }
    public int[] shiftLeft(int[] nums) {
        if(nums.length < 1) return nums;
        int[] numsL = new int[nums.length];
        numsL[nums.length-1] = nums[0];
        for(int i=0; i < nums.length-1; i++) {
            numsL[i] = nums[i+1];
        }
        return numsL;
    }
    public int[] tenRun(int[] nums) {
        int fl=0;

        for(int i=0; i < nums.length; i++) {
            if(nums[i]%10 == 0) {
                if(fl==0) {
                    fl=1;
                }
            }
            if(fl == 1 && nums[i]%10 != 0) {
                nums[i] = nums[i-1];
            }

        }
        return nums;
    }
    public int[] pre4(int[] nums) {
        int l = Arrays.binarySearch(nums, 4);
        int[] ar =  new int[l];
        for(int i=0; i < l; i++) {
            ar[i] = nums[i];
        }
        return ar;
    }
    public int[] post4(int[] nums) {
        int l = 0;
        for(int i =0; i < nums.length; i++) {
            if(nums[i] == 4) l=i;
        }
        int[] n1 = new int[nums.length - l-1];
        for(int i=l+1,j=0; i < nums.length;i++,j++) {
            n1[j] = nums[i];
        }
        return n1;
    }
    public int[] notAlone(int[] nums, int val) {
        for(int i=0; i<nums.length; i++) {
            if( i > 0 && i < nums.length-1 && nums[i] == val) {
                if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) {
                    nums[i] = Math.max(nums[i-1],nums[i+1]);
                }
            }
        }
        return nums;
    }
    public int[] zeroFront(int[] nums) {

        if(nums.length<1) {
            return nums;
        }
        Arrays.sort(nums);
        if(nums[0] < 0) {
            int[] n = new int[nums.length];
            int l = Arrays.binarySearch(nums, 0);
            for(int i=0, j=l; i < nums.length; i++, j++) {
                n[i] = nums[j];
                if(j == nums.length-1) {
                    j=-1;
                }
            }

            return n;
        }
        else {
            return nums;
        }

    }
    public int[] withoutTen(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            for(int j=i+1; j < nums.length; j++) {
                if(nums[i] == 10 && nums[j] != 10) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            if(nums[i] == 10) nums[i] = 0;
        }

        return nums;
    }
    public int[] zeroMax(int[] nums) {


        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0 ){
                int max = 0;
                for(int j=i; j<nums.length; j++) {
                    if(nums[j]%2 == 1 && nums[j] > max) {
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }
    public int[] evenOdd(int[] nums) {
        int[] n = new int[nums.length];
        int j=0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i]%2 == 0) {
                n[j] = nums[i];
                j++;
            }
        }

        for(int i=0; i < nums.length; i++) {
            if(nums[i]%2 == 1) {
                n[j] = nums[i];
                j++;
            }
        }
        return n;
    }
    public String[] fizzBuzz(int start, int end) {
        int l = end-start;
        String[] fb = new String[l];
        for(int i=start, j=0; i < end; i++,j++) {
            if( (i)%3 == 0 && (i)%5 == 0 ) {
                fb[j] = "FizzBuzz";
            }
            else if( (i)%3 == 0 ) {
                fb[j] = "Fizz";
            }
            else if ( (i)%5 == 0 ) {
                fb[j] = "Buzz";
            }
            else {
                fb[j] = String.valueOf(i);
            }
        }
        return fb;
    }
    public boolean lucky13(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1 || nums[i] == 3)
                return false;
        }
        return true;
    }

}
