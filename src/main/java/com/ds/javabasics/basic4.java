package com.ds.javabasics;

import java.util.Scanner;

//calculate number of digits
public class basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.close();

        int digits =0;
        while(num != 0){
            digits += 1;
            num = num / 10;
        }
        System.out.println("Number of digits " + digits);
    }
}
