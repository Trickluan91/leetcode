package org.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assertions.assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
        Assertions.assertEquals("aa", longestCommonPrefix.longestCommonPrefix(new String[]{"aaa","aa","aaa"}));
        Assertions.assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"a","aa","aaa"}));
        Assertions.assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"aaa","aa","a"}));
        Assertions.assertEquals("aa", longestCommonPrefix.longestCommonPrefix(new String[]{"aaaa","aa","aaaaaa"}));
    }
}
