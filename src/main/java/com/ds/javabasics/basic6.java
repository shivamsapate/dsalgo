package com.ds.javabasics;

import java.util.Scanner;

//print digits of number in reverse order
public class basic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        while (num != 0) {
            System.out.println(num % 10);
            num /= 10;
        }

    }
}
