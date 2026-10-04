package Problems;

import java.util.Arrays;

public class LeetCode974 {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        String s = Arrays.toString(nums);
        System.out.println(s);
        System.out.println(s.charAt(2));
//        System.out.println(subarraysDivByK(nums,k));

    }
    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
