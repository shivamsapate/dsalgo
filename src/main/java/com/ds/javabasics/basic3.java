package com.ds.javabasics;

import java.util.Scanner;

//fibonacci series - 0, 1, 1, 2, 3 
public class basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int a = 0; int b = 1;
        int result = 0;
        while(n!=0){
            System.out.print(a + " ");
            result = a;
            int temp = a + b;
            a = b;
            b = temp; 
            n--;
        }

        System.out.println("\nNth fibo number : "+result);
    }
}
