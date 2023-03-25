package com.ds.gfg.string;

import java.util.Scanner;

//check String is palindrome or not 
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPal(str));
        System.out.println(isPalWithoutfun(str));
    }

    public static boolean isPal(String str) {
        StringBuffer br = new StringBuffer(str);
        br.reverse();
        return str.equals(br.toString());
    }

    public static boolean isPalWithoutfun(String str) {
        int length = str.length();
        int last = length - 1;
        for (int i = 0; i <= length / 2; i++) {
            if (str.charAt(i) == str.charAt(last)) {
                last--;
            } else {
                return false;
            }
        }
        return true;
    }
}
