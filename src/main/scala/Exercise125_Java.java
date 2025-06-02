package com.melifaro;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise125_Java {
    public static boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                s1.append(s.charAt(i));
            }
        }
        int length = s1.length();
        if (length < 2) {
            return true;
        } else {
            String s2 = s1.toString().toLowerCase();
            for (int i = 0; i < length / 2; i++) {
                if (s2.charAt(i) == s2.charAt(length - i - 1)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbca"));
        System.out.println(isPalindrome("abbca11"));
        System.out.println(isPalindrome("11abba11"));
        System.out.println(isPalindrome("1  1 "));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(" "));
    }
}
