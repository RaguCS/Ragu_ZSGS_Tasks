package Task_1;

public class Array_3 {
    public int maxSpan(int[] nums)
    {
        int maxSpan = 0;
        int span;
        int j;
        for(int i = 0; i < nums.length; i++)
        {
            for(j = nums.length - 1; nums[i] != nums[j]; j--);
            span = 1 + j - i;
            if(span > maxSpan)
                maxSpan = span;
        }
        return maxSpan;
    }

    public int[] fix34(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==3) {;
                for(int j=0; j < nums.length; j++) {
                    if(nums[j] == 4 && nums[j-1] !=3 ) {
                        int temp = nums[j];
                        nums[j] = nums[i+1];
                        nums[i+1] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }
    public int[] fix45(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==4) {;
                for(int j=0; j < nums.length; j++) {
                    if(nums[j] == 5 ) {
                        if(j-1 < 0 || nums[j-1] !=4) {
                            int temp = nums[j];
                            nums[j] = nums[i+1];
                            nums[i+1] = temp;
                            break;
                        }
                    }
                }
            }
        }
        return nums;
    }
    public boolean canBalance(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            int sum = 0;
            for(int j=0; j < i; j++) {
                sum = sum + nums[j];
            }
            for(int j=i; j < nums.length; j++) {
                sum = sum - nums[j];
            }
            if( sum == 0) return true;
        }
        return false;
    }
    public boolean linearIn(int[] outer, int[] inner) {
        int fl=0;
        int minO = outer[0];
        int maxO = outer[outer.length-1];
        for(int i=0; i < inner.length; i++) {
            fl=0;
            if(inner[i] >= minO && inner[i] <= maxO) {
                for(int j=0; j < outer.length; j++) {
                    if(inner[i] == outer[j]) {
                        fl = 1;
                        break;
                    }
                }
                if(fl==0) {
                    return false;
                }
            }
            else {
                return false;
            }

        }
        return true;
    }
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        int pos = 0;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) result[pos++] = 0;
            for (int j = i; j > 0; j--) result[pos++] = j;
        }
        return result;
    }
    public int[] seriesUp(int n) {
        int[] nums = new int[n*(n + 1)/2];
        int z = 1, n2 =1;
        for(int i=0; i < nums.length; i++) {
            nums[i] = z;
            if(z==n2) {
                z=1;
                n2++;
            }
            else {
                z++;
            }
        }
        return nums;
    }
    public int maxMirror(int[] nums) {
        int max= 0;
        for(int i=0; i < nums.length; i++) {
            int count = 0;
            for(int j=nums.length-1; j >=0 && i+count < nums.length; j--) {
                if(nums[i+count] == nums[j]) {
                    count++;
                }
                else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }

            max = Math.max(max, count);
        }
        return max;
    }
    public int countClumps(int[] nums) {
        int count=0;
        boolean fl = false;
        for(int i=1; i < nums.length; i++) {
            if(i > 0 && nums[i-1] == nums[i] ) {
                if(!fl) {
                    count++;
                    fl=true;
                }
            }
            else {
                fl=false;
            }

        }
        return count;
    }
}
