package com.ds.Inter;

import java.util.Scanner;

//reverse a string 
public class Inter1 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer bf = new StringBuffer();
        for(int i = str.length()-1; i>=0; i--){
            bf.append(str.charAt(i));
        }
        System.out.println(bf);

        bf = new StringBuffer();
        for(char ch : str.toCharArray()){
            bf.append(ch);
        }

        System.out.println(bf.reverse());
    }
    
}
