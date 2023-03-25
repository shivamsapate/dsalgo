package com.ds.gfg.basicmath;

import java.util.Scanner;

//print all divisor 
public class Math9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divisor(n);
        divisorOptimized(n);
        sc.close();
    }

    // Naive approach O(N)
    public static void divisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // optimized approach O(sqrt(N))
    public static void divisorOptimized(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }
}
