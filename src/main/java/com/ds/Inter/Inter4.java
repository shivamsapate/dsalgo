package com.ds.Inter;

import java.util.Scanner;

public class Inter4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int count = 0;

        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count != 1)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }
}
