package com.ds.Inter;

import java.util.Scanner;

//String palindrome
public class Inter7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int flag = 0;
        int length = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                flag = 1;
                break;
            }
        }
        String result = flag == 1 ? "not palindrome" : "palindrome";
        System.out.println(result);
    }
}
