package com.ds.gfg.bitwise;

import java.util.Scanner;

//check kth bit it set or not
public class Bitwise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(checkKthBit(n, k));
        System.out.println(checkKthBit2nd(n, k));
    }

    public static boolean checkKthBit(int n, int k) {
        int mask = 1 << (k - 1);
        if ((n & mask) != 0) {
            return true;
        } else
            return false;
    }

    public static boolean checkKthBit2nd(int n, int k) {
        int mask = (n >> (k - 1));
        if ((mask & 1) == 1) {
            return true;
        } else
            return false;
    }
}
