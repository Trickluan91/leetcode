package org.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheIndexTest {
    @Test
    public void test() {
        FindTheIndex findTheIndex = new FindTheIndex();
        Assertions.assertEquals(0, findTheIndex.strStr("sadbutsad", "sad"));
        Assertions.assertEquals(-1, findTheIndex.strStr("leetcode", "leeto"));
        Assertions.assertEquals(4, findTheIndex.strStr("leetcode", "code"));
        Assertions.assertEquals(-1, findTheIndex.strStr("aaaaa", "bba"));
        Assertions.assertEquals(4, findTheIndex.strStr("mississippi", "issip"));
    }
}
