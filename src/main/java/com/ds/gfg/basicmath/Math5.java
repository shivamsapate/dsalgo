package com.ds.gfg.basicmath;

import java.util.Scanner;

//gcd of two numbers
public class Math5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a, b);
        System.out.println(res);
        System.out.println(gcdRecur(a, b));
        System.out.println(lcm(a, b));
        sc.close();
    }

    // Euclid algorithms - bigO(N)
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // best approach- Optimized
    public static int gcdRecur(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcdRecur(b, (a % b));
        }
    }

    public static int lcm(int a, int b) {
        int res = a * b;
        return res / gcd(a, b);
    }
}
