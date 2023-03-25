package com.ds.gfg.basicmath;

import java.util.Scanner;

//count number of digits using log10
public class Math1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(count(num));
    }

    public static int count(int num) {
        int count = (int) Math.floor(Math.log10(num)) + 1;
        return count;
    }
}
