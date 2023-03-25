package com.ds.gfg.string;

import java.util.Arrays;
import java.util.Scanner;

//find left most first repeating character from string
//example - shivams -> s, geeksforgeeks -> g
public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = leftMost(str);
        System.out.println(res);
        System.out.println(leftElement(str));
    }

//good approach
    public static int leftMost(String str) {
        int[] CHAR = new int[256];
        Arrays.fill(CHAR, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int fIndex = CHAR[str.charAt(i)];
            if (fIndex == -1) {
                CHAR[str.charAt(i)] = i;
            } else {
                res = Math.min(fIndex, res);
            }
        }
        return res==Integer.MAX_VALUE ? -1 : res;
    }

    public static int leftElement(String str){
        boolean[] visited = new boolean[256];
        Arrays.fill(visited, false);
        int res = -1;
        for(int i = str.length()-1; i>=0; i--){
            if(visited[str.charAt(i)]){
                res = i;
            } else {
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
}
