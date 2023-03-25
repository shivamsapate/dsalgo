package com.ds.Patterns;

import java.util.Scanner;
// 5
// *
//  *
//   *
//    *
//     *

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int sp = 0; sp < space; sp++)
                System.out.print(" ");
            System.out.print("*");
            space++;

            System.out.println();
        }

    }
}
