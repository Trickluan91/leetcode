package org.leetCode;

//нерабочая хуе та
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        boolean open1 = false, open2 = false, open3 = false, closed1 = false, closed2 = false, closed3 = false;
        char prev = s.charAt(0);
        for (char c : s.toCharArray()) {
            if(c == '(') { open1 = true; prev = c; continue; }
            if(c == '[') { open2 = true; prev = c; continue; }
            if(c == '{') { open3 = true; prev = c; continue; }

            if(c == ')' && prev == '(') { closed1 = true; prev = c; continue; }
            else if(c == ')') return false;

            if(c == ']' && prev == '[') { closed2 = true; prev = c; continue; }
            else if(c == ']') return false;

            if(c == '}' && prev == '{') { closed3 = true; prev = c; }
            else if(c == '}') return false;
        }

        return (open1 == closed1) && (open2 == closed2) && (open3 == closed3);
    }
}
