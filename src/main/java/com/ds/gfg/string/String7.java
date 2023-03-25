package com.ds.gfg.string;

import java.util.Arrays;
import java.util.Scanner;

//reverse words from string
public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char charStr[] = str.toCharArray();
        reverseWords(charStr, charStr.length);
        System.out.println(new String(charStr));
    }

    public static void reverseWords(char[] str,int n ){
        int start = 0;
        for(int end = 0; end < n; end++){
            if(str[end] == ' '){
                reverse(str,start, end-1);
                start = end+1;
            }
        }
        reverse(str, start, n-1);
        reverse(str, 0, n-1);
    }

    public static void reverse(char[] str, int start, int end){
        while(start<=end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
