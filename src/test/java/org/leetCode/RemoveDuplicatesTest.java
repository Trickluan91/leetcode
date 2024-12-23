package org.leetCode;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        test(new int[]{1, 1, 2, 2, 3, 3, 4}, new int[]{1, 2, 3, 4});
        test(new int[]{1,1,2}, new int[]{1, 2});
        test(new int[]{0,0,1,1,1,2,2,3,3,4}, new int[]{0, 1, 2, 3, 4});
    }

    private void test(int[] nums, int[] expectedNums)
    {
        RemoveDuplicates rmD = new RemoveDuplicates();
        int k = rmD.removeDuplicates(nums);
        assert k == expectedNums.length;

        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
