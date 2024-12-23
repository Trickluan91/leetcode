package org.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    @Test
    public void test() {
        ValidParentheses vp = new ValidParentheses();
        Assertions.assertTrue(vp.isValid("()"));
        Assertions.assertTrue(vp.isValid("()[]{}"));
        Assertions.assertFalse(vp.isValid("(]"));
        Assertions.assertTrue(vp.isValid("([])"));
        Assertions.assertFalse(vp.isValid("(}})"));
        Assertions.assertFalse(vp.isValid("([)]"));
    }
}
