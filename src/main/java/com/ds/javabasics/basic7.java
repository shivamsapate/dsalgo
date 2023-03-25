package com.ds.javabasics;

import java.util.Scanner;
//Inverse the number 
// index 5 4 3 2 1
// value 2 1 4 5 3  --> answer is 23154
public class basic7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();
        int result = 0;
        int index = 0;
        while(num != 0){
            int rem = num % 10;
            index +=1;
            result = result + index*(int)Math.pow(10, rem-1);
            num /= 10;
        }
        System.out.println(result);
    }
}
