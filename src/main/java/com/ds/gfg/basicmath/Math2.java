package com.ds.gfg.basicmath;

import java.util.Scanner;

//print number is palindrome or not
public class Math2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        boolean res = isPal(num);
        System.out.println(res);
        sc.close();

    }

    public static boolean isPal(int num){
        int res = 0;
        int n = num;
        while(n!=0){
            int rem = n % 10;
            res = res * 10 + rem;
            n = n / 10; 
        }
        return res==num;
    }
}
