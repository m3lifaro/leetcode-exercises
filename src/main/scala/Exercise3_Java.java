package com.melifaro;


import java.util.HashSet;
import java.util.Set;

public class Exercise3_Java {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - pos + 1);
            } else {
                while (charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(pos));
                    pos++;
                }
                charSet.add(s.charAt(i));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("qwertyuiopqqrstuvwxyz"));
    }
}
