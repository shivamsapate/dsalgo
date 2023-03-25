package com.ds.Inter;

import java.util.Scanner;

//find fibonacci series
public class Inter5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.print(fibo(i) + " ");
        }
        fiboIter(5);
    }

    // recursive way
    public static int fibo(int num) {
        if (num <= 1)
            return num;
        return fibo(num - 1) + fibo(num - 2);
    }

    // Iterative way
    public static void fiboIter(int num) {

        int a = 0;
        int b = 1;
        while (num != 0) {
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
            num--;
        }

    }

}
