package com.ds.Inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inter11 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num){
        
        if(num <= 1)
            return false;
        
        if(num == 2 || num == 3)
            return false;
        
        if(num % 2 ==0 || num % 3 ==0)
            return false;
        
        for(int i = 5; i<=Math.sqrt(num); i=i+6)
                if(num%i == 0 || (num)%(i+2)==0)
                    return false;
        
        return true;
    }

    



}
