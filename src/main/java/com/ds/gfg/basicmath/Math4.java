package com.ds.gfg.basicmath;

import java.util.Scanner;

public class Math4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fact(n);
        
        printTrallingZero(res);
        printTral(n);
        sc.close();

    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        
        return n * fact(n-1);
    }

    //not efficient method
    public static void printTrallingZero(int n){
        int count = 0;
        while(n%10 == 0){
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    public static void printTral(int n){
        int res = 0;
        for(int i = 5;i <=n; i=i*5){
            res = res + (n/i);
        } 
        System.out.println(res);
        //creation of algorithms
    }
}
