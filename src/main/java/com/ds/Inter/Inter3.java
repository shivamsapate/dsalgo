package com.ds.Inter;

import java.util.Scanner;

//check vowels are present in string or not
public class Inter3 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(str.toLowerCase().matches("[a]"));
    
    }
}
