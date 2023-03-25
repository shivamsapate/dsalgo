package com.ds.javabasics;

import java.util.Scanner;

//find prime numbers between range
public class basic2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        sc.close();

        for(int i = low; i<=high; i++){
            int prime = 1;
            for(int j = 2; j*j<=i; j++){
                if(i % j == 0){
                    prime = 0; 
                    break;
                } 
            }
            if(prime==1)
                System.out.println(i+" ");
        }
        
    }
    
}
