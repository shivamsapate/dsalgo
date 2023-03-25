package com.ds.gfg.basicmath;

import java.util.Scanner;

//print prime factors
public class Math7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactor(n);
        // primeFactors(n);
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n % 2 == 0 && n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 && n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeFactor(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                int x = i;
                if (n % x == 0) {
                    System.out.println(x);
                    x = x * i;
                }
            }
        }
    }

    public static void primeFactors(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }

}
