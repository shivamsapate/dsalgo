package com.ds.gfg.string;

import java.util.Arrays;
import java.util.Scanner;

//Check string anagram
public class String4 {

    static final int CHAR = 256;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean result = checkAnagram(str1, str2);
        System.out.println(checkAnagramBest(str1, str2));
        System.out.println(result);
    }
    
    //Naive approach
    public static boolean checkAnagram(String str1, String str2){
        char[] arrayStr1 = str1.toCharArray();
        Arrays.sort(arrayStr1);
        str1 = new String(arrayStr1);

        char[] arrayStr2 = str2.toCharArray();
        Arrays.sort(arrayStr2);
        str2 = new String(arrayStr2);

        return str1.equals(str2);
    }   

    //best approach
    public static boolean checkAnagramBest(String str1, String str2){
        int[] charCount = new int[CHAR];
        if(str1.length() != str2.length()){
            return false;
        }   
        for(int i = 0; i<str1.length(); i++){
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for(int i = 0; i<charCount.length; i++){
            if(charCount[i]!=0){
                return false;
            }
        }
        return true;
    }


}
