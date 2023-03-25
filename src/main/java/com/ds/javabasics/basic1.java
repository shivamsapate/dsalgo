package com.ds.javabasics;

import java.util.Scanner;

//best approach because 
//non prime number is divided by only up to its square root number like 36 divided by max to 6
public class basic1 {

    public static void main(String... args){
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int count = 0;
            for(int i = 2; i * i <= n; i++){  
                if(n % i ==0){
                    count++;
                    break;
                } 
            }
            if(count == 0){
                System.out.println(n + "prime");
            } else {
                System.out.println(n + "Not prime");
            }
            t--;
        }
        sc.close();
    }
}

