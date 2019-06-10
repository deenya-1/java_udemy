package com.section_8;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int temp = 0;

        for(int i = 0;i<arr.length / 2;i++) {
            temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
            ;
        }
    }
}

