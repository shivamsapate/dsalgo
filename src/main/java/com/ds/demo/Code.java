package com.ds.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Code {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int n1  = 200;
        int n2  = 200;

        int inc = 3;

        for(int i = 0; i < n; i++){
            if(i % 2 == 1){
                int s = n2;
                ArrayList<Integer> arr = new ArrayList<>();
                for(int j = 0; j < inc; j++){
                    s += n1;
                    if(j == inc - 3) {
                        n2 = s;
                    }
                    arr.add(s);
                } 
                // System.out.println(arr.toString());
                // System.out.println(StringUtils.substringBetween(Arrays.toString(arr), "[", "]"))
                String str = arr.toString().replaceAll(",", "");
                int cnt = str.length();
                if(i == 1) {
                    System.out.println(str.substring(1, cnt-1) + " ");
                }
                else {
                    System.out.println(str.substring(1, cnt-1));
                }
                
                int pre_n2 = s + n1;
                n1 = n2 + 100;
                n2 = pre_n2;
                n2 -= n1;
                inc +=1;

            } else {
                System.out.println(n1);
            }
        }
    }
}
