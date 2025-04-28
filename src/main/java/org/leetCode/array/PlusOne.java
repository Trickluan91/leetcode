package org.leetCode.array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int cursor = digits.length - 1;
        int digit = digits[cursor];

        while (digit == 9) {
            digits[cursor] = 0;
            if(cursor == 0) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                System.arraycopy(digits, 0, newArray, 1, digits.length);
                return newArray;
            }
            cursor--;
            digit = digits[cursor];
        }
        digits[cursor] = digit + 1;
        return digits;
    }
}
