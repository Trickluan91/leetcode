package org.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {
    @Test
    public void test() {
        SearchInsertPosition sip = new SearchInsertPosition();

        Assertions.assertEquals(2, sip.searchInsert(new int[]{1,3,5,6}, 5));
        Assertions.assertEquals(1, sip.searchInsert(new int[]{1,3,5,6}, 2));
        Assertions.assertEquals(4, sip.searchInsert(new int[]{1,3,5,6}, 7));
        Assertions.assertEquals(0, sip.searchInsert(new int[]{1,3,5,6}, 0));
    }
}
