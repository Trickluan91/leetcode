package org.leetCode;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int temp = -101;
        for (int num : nums) {
            if(num > temp){
                temp = num;
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}
