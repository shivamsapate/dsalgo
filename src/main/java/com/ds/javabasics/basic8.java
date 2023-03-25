package com.ds.javabasics;

import java.util.Scanner;

//rotate the number input-n=123456,k=2 or k=8-> 561234  
public class basic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();
        //number of rotation
        int num_digit = digits(n);
        k = k % num_digit;
        
        int quo = (int)Math.pow(10, k);
        int rem = n % quo;
        n = n / quo;
        int digit = digits(n);
        int result = rem * (int)Math.pow(10, digit) + n;
        System.out.println(result);


    }

    public static int digits(int n){
        int digit = 0;

        while(n!=0){
            digit++;
            n/=10;
        }
        return digit;
    }
}
