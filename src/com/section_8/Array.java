package com.section_8;

import java.util.Scanner;

public class Array {



    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];
        int i = 0;

        while(true) {

            if (i == arr.length - 1) {
                arr
            }

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                arr[i] = number;
                i++;
            } else {
                break;
            }

            scanner.nextLine();
        }
        scanner.close();

        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(arr);
    }

    public static int[] sortIntegers(int[] arr) {

        return sorted;
    }
}
