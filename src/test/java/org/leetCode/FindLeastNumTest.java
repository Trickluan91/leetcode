package org.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindLeastNumTest {
    @Test
    public void test1(){
        int count = FindLeastNum.findLeastNumOfUniqueInts(new int[]{4,3,1,3,3,2,2,4}, 5);
        Assertions.assertEquals(1, count);

        count = FindLeastNum.findLeastNumOfUniqueInts(new int[]{3,1,7,2,4,2,5}, 5);
        Assertions.assertEquals(1, count);

        count = FindLeastNum.findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3);
        Assertions.assertEquals(2, count);
    }
}
