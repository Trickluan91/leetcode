package org.leetCode;

public class TwoSum {
    public static int[] getTwoSum(int[] nums, int target)
    {
//        Arrays.sort(nums);
//        int[] ans = new int[2];
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[0] + nums[i] == target)
//            {
//                return new int[]{nums[0]}
//            }
//        }
//        return new int[]{0,0};




        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}
