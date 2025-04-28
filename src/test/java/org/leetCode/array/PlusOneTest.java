package org.leetCode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneTest {
    @Test
    public void test() {
        PlusOne plusOne = new PlusOne();
        Assertions.assertArrayEquals(new int[]{1,2,4}, plusOne.plusOne(new int[]{1,2,3}));
        Assertions.assertArrayEquals(new int[]{4,3,2,2}, plusOne.plusOne(new int[]{4,3,2,1}));
        Assertions.assertArrayEquals(new int[]{1,0}, plusOne.plusOne(new int[]{9}));
        Assertions.assertArrayEquals(new int[]{1,0,0}, plusOne.plusOne(new int[]{9,9}));
        Assertions.assertArrayEquals(new int[]{9,0,0}, plusOne.plusOne(new int[]{8, 9,9}));
    }
}
