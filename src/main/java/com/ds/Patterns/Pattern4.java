package com.ds.Patterns;

import java.util.Scanner;
// 5
// *****
//  ****
//   ***
//    **
//     *
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int space = 0;
        for (int i = n; i >= 1; i--) {
            for (int sp = 0; sp < space; sp++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}
