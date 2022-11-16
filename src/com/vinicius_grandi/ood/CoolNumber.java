package com.vinicius_grandi.ood;

import java.util.Arrays;

public class CoolNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 4, -1, 3, 0, 111};
        int[] sortedNumbers = {-1, 0, 2, 4, 2, 111};
        // it sorts the array, modifying the original reference
        Arrays.sort(numbers);

        // it prints array as string
        System.out.println(Arrays.toString(numbers));

        // it performs a deep comparison between two arrays
        System.out.println(Arrays.equals(numbers, sortedNumbers));
    }
}
