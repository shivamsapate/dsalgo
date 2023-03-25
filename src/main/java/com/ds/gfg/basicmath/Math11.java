package com.ds.gfg.basicmath;

import java.util.Scanner;

public class Math11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = power(x, n);
        res = powerOptimized(x, n);
        System.out.println(res);
    }

    // calculating power of number
    public static int power(int x, int n){
        if(n==0){
            return 1;
        } 
        int temp = power(x, n/2);
        int res = temp * temp;
        if(n%2!=0){
            return res * x;
        } else 
            return res;
    }

    public static int powerOptimized(int x, int n) {
        int res = 1;
        while(n > 0){
            if(n%2==1){
                res = res * x;
            } 
            x = x * x;
            n = n / 2; //n = n>>1;
        }
        return res;
    }
}
