package com.ds.Inter;

import java.util.Scanner;

//swap numbers without using third variable
public class Inter2 {
    
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int sum = n1 + n2;
        n1 = sum - n1;
        n2 = sum - n2;

        System.out.println("n1 :" + n1+ " n2 :"+n2);
    }
}
