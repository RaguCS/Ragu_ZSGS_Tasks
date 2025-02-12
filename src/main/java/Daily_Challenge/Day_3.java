package Daily_Challenge;

import java.util.Arrays;

public class Day_3 {
    Day_3 d1=new Day_3();
    public static void main(String[] args) {

        Day_3 d = new Day_3();
        System.out.println(Arrays.toString(d.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt = new int[101];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i - 1];
        }
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = cnt[nums[i] - 1];
            }
        }
        return res;
    }
}
