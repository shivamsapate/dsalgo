package com.ds.gfg.string;

import java.util.Scanner;
//string subsequence is present or not
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(compareSubsequence(str1, str2));
        
    }
    public static boolean compareSubsequence(String str1, String str2){
        int i = 0 , j = 0;
        while(i <str1.length() && j <str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            } else{
                i++;
            }
        }
        if(j==str2.length()){
            return true;
        } else {
            return false;
        }
    }
}
