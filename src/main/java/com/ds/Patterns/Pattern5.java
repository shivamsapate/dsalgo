package com.ds.Patterns;

import java.util.Scanner;
//print diamond pattern
// 5
//   *
//  ***
// *****
//  ***
//   *

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n / 2;
        int star = 1;
        sc.close();

        for (int i = 1; i <= n; i++) {
            // System.out.println(space + "," + star);
            for (int sp = 0; sp < space; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }

            System.out.println();
        }
    }
}
