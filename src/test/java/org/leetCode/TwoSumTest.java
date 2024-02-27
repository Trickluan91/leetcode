package org.leetCode;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class TwoSumTest {

    @Test
    public void test1(){
        int[] ans = TwoSum.getTwoSum(new int[]{2,7,11,15}, 9);
        Assertions.assertThat(ans).containsExactlyInAnyOrder(0,1);

        ans = TwoSum.getTwoSum(new int[]{3,2,4}, 6);
        Assertions.assertThat(ans).containsExactlyInAnyOrder(1,2);

        ans = TwoSum.getTwoSum(new int[]{3,3}, 6);
        Assertions.assertThat(ans).containsExactlyInAnyOrder(0,1);

        ans = TwoSum.getTwoSum(new int[]{2,5,5,11}, 10);
        Assertions.assertThat(ans).containsExactlyInAnyOrder(1,2);

        ans = TwoSum.getTwoSum(new int[]{-3,4,3,90}, 0);
        Assertions.assertThat(ans).containsExactlyInAnyOrder(0,2);
    }
}
