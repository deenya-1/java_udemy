package com.section_11;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i ++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }

        int factorial = 1;

        for (int i = 1; i <= n; i ++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            int fn_2 = 0;
            int fn_1 = 1;

            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = fn_1 + fn_2;
                fn_2 = fn_1;
                fn_1 = fib;
                //System.out.println("i=" + i + ": " + fn_2 + " " + fn_1 + " " + fib);
            }
            return fib;
        }
    }

}
