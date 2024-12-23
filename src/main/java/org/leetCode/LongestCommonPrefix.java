package org.leetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(result.isEmpty())
                break;

            for (int j = 0; j < strs[i].length(); j++) {
                if(result.length() <= j)
                    break;

                if(result.charAt(j) != strs[i].charAt(j)) {
                    result = result.substring(0, j);
                    break;
                }
            }

            if(result.length() > strs[i].length())
                result = result.substring(0, strs[i].length());
        }
        return result;
    }
}
