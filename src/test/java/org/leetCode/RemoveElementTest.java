package org.leetCode;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;

public class RemoveElementTest {
    @Test
    public void testRemoveElement() {
        test(3, new int[]{3,2,2,3}, new int[]{2, 2});
        test(2, new int[]{0,1,2,2,3,0,4,2}, new int[]{0, 0, 1, 3, 4});
    }

    private void test(int val, int[] nums, int[] expectedNums)
    {
        RemoveElement rmD = new RemoveElement();
        int k = rmD.removeElement(nums, val);
        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
