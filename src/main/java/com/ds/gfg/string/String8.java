package com.ds.gfg.string;

import java.util.Scanner;

//check if string are rotations
public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(findRotated(str1, str2));
    }
    public static boolean findRotated(String str1, String str2){
        if(str1.length() != str2.length()) 
            return false;
        str1 = str1 + str1;
        return str1.contains(str2) ?  true :  false;
    }
}
