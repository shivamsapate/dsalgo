package com.ds.javabasics;

import java.util.Scanner;

public class basic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        //calculating digits 
        int digits = calculateDigits(num);

        //calculating divisor
        int div =(int)(Math.pow(10, digits-1));
        
        while(div != 0){
            System.out.println(num / div);
            num = num % div;
            div = div / 10;
        }
    }

    public static int calculateDigits(int num){
        int digits = 0;
        while(num != 0){
            num = num / 10;
            digits+=1;
        }
        return digits;
    }
}
