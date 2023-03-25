package com.ds.gfg.bitwise;

import java.util.Scanner;

public class Bitwise1 {
    public static void main(String... args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        // bitwise and operation
        System.out.println("bitwise operation and" + (n1 & n2));

        // bitwise or operation
        System.out.println("bitwise operation or " + (n1 | n2));

        // bitwise xor operation
        System.out.println("bitwise operation or " + (n1 ^ n2));

        //bitwise << left shift getting multiplication of n1 * 2^1
        System.out.println(n1<<1);

        sc.close();
    }
}
