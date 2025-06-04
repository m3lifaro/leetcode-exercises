package com.melifaro;


import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise1385_Java {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        AtomicInteger counter = new AtomicInteger();
        for (int current : arr1) {
            Arrays.stream(arr2).filter(elem -> Math.abs(current - elem) <= d).findFirst().ifPresent(e -> counter.incrementAndGet());
        }
        return arr1.length - counter.get();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,4,2,3};
        int[] arr2 = new int[]{-4,-3,6,10,20,30};
        System.out.println(findTheDistanceValue(arr1,arr2,3));
    }
}
