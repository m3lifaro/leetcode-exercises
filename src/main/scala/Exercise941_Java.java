package com.melifaro;


import java.util.HashSet;
import java.util.Set;

public class Exercise941_Java {

    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) {
            return false;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        boolean isValid = false;
        boolean isDecreasing = false;
        for (int i = 1; i < len; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            if (!isDecreasing) {
                if (arr[i] > arr[i - 1]) {
                    isValid = true;
                } else {
                    isValid = true;
                    isDecreasing = true;
                }
            } else {
                if (arr[i] < arr[i - 1]) {
                    isValid = true;
                } else {
                    return false;
                }
            }
        }
        return isValid && isDecreasing;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{9,8,7}));
    }
}
