package com.ds.gfg.string;

import java.util.Scanner;

//print the character count in sorted order
public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        countChar(str);
    }

    //calculating count of number of character
    public static void countChar(String str){
        int[] count = new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i = 0; i<26; i++){
            if(count[i]>0){
                System.out.println((char)(i+'a') +" "+ count[i] );
            }
        }
    }
}
