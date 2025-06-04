package com.melifaro;


import java.util.Arrays;

public class Exercise66_Java {

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 1;

        while (carry != 0 && len > 0) {
            int digit = digits[len - 1];
            if (digit == 9) {
                digits[len - 1] = 0;
                len--;
            } else {
                digits[len - 1] += carry;
                carry = 0;
            }
        }
        if (carry != 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);

            return newDigits;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        Arrays.stream(plusOne(new int[]{9, 9, 9, 9, 9, 9, 9})).forEach(System.out::println);
    }
}
