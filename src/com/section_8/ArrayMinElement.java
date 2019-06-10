package com.section_8;

import java.util.Scanner;

public class ArrayMinElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count:\r");
        int count = scanner.nextInt();
        int[] arr = readIntegers(count);
        int minElement = findMin(arr);

        System.out.println("Min element = " + minElement);
    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];
        System.out.println("Enter " + count +" integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;

    }

    public static int findMin(int[] arr) {

        int minElem = arr[0];

        for(int i=1;i < arr.length; i++) {
            minElem = arr[i] < minElem ? arr[i] : minElem;
        }

        return minElem;
    }
}
