package org.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    public void test() {
        Palindrome p = new Palindrome();
        Assertions.assertTrue(p.isPalindrome(121));

        Assertions.assertFalse(p.isPalindrome(-121));

        Assertions.assertFalse(p.isPalindrome(10));
    }
}
