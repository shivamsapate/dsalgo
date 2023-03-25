package com.ds.Patterns;

import java.util.Scanner;
// 5
//     *
//    *
//   *
//  *
// *
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 4;
        scn.close();
        for (int i = 1; i <= n; i++) {
            for(int sp = 0; sp<space; sp++){
                System.out.print(" ");
            }
            space--;
            System.out.print("*");

            System.out.println();
        }
    }
}
