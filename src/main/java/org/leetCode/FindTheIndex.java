package org.leetCode;

import java.util.Arrays;

public class FindTheIndex {
    public int strStr(String haystack, String needle) {
        char[] part = needle.toCharArray();
        char[] text = haystack.toCharArray();
        for (int i = 0; i < text.length; i++) {
            if(text[i] == part[0]){
                if(i + part.length > text.length){
                    break;
                }
                if(Arrays.equals(Arrays.copyOfRange(text, i, i + part.length), part))
                    return i;
            }

        }
        return -1;
    }
}
