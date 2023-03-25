package com.ds.Inter;

import java.util.Scanner;

//remove spaces from a string in Java
public class Inter8 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer result = new StringBuffer();

        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }
        System.out.println(result);

    }
}
