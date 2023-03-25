package com.ds.gfg.basicmath;

import java.util.Scanner;

public class Math8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactor(n);
        sc.close();
    }

    public static void printPrimeFactor(int n) {
        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            if (n % (i + 2) == 0) {
                System.out.println(i);
                n = n / (i + 2);
            }
        }
        if (n > 3) {
            System.out.println(n);
        }
    }
}
