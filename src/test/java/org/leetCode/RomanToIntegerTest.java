package org.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
    @Test
    public void romanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
