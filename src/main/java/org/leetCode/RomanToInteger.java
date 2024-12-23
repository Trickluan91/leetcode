package org.leetCode;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0, previous = 0;
        for (int i = 0; i < s.length(); i++) {
            int now = convert(s.charAt(i));

            if(previous != 0 && now > previous)
                result += now - (previous * 2);
            else
                result += now;

            previous = now;
        }
        return result;
    }

    private int convert(char s) {
        return switch (s) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
