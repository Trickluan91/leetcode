package org.leetCode.string;

public class LengthLastWord {
    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int symbols = 0;
        for (int i = chars.length; i != 0 ; i--) {
            if(chars[i-1] == ' ' && symbols == 0) continue;
            else if(chars[i-1] == ' ') break;
            symbols++;
        }
        return symbols;
    }
}
