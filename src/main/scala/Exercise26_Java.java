package com.melifaro;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise26_Java {

    public static int removeDuplicates(int[] nums) {
        int cursor = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                cursor++;
                nums[cursor] = nums[i];
            }
        }
        return cursor + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 3, 3, 4}));
    }
}
