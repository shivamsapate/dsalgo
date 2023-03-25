package com.ds.Patterns;

import java.util.Scanner;
// 5 print hollow diamond
// *** ***
// **   **
// *     *
// **   **
// *** ***

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 1;
        int star = n / 2 + 1;
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int st = 0; st < star; st++) {
                System.out.print("*");
            }
            for (int sp = 0; sp < space; sp++) {
                System.out.print(" ");
            }
            for (int st = 0; st < star; st++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
            }
            System.out.println();
        }

    }
}
