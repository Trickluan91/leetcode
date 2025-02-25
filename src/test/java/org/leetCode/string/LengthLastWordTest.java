package org.leetCode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthLastWordTest {
    @Test
    public void test() {
        Assertions.assertEquals(5, LengthLastWord.lengthOfLastWord("Hello World"));
        Assertions.assertEquals(4, LengthLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        Assertions.assertEquals(6, LengthLastWord.lengthOfLastWord("luffy is still joyboy"));
        Assertions.assertEquals(1, LengthLastWord.lengthOfLastWord("l"));
    }
}
