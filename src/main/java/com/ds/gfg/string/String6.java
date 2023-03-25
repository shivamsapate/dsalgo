package com.ds.gfg.string;

import java.util.Arrays;
import java.util.Scanner;

//print first non repeating character from string
public class String6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = leftNonRep(str);
        System.out.println(res);
    }

    //best approach
    public static int leftNonRep(String str){
        int isVisited[] = new int[256];
        Arrays.fill(isVisited, -1);
        for(int i = 0; i <str.length(); i++){
            if(isVisited[str.charAt(i)]==-1){
                isVisited[str.charAt(i)]=i;
            } else {
                isVisited[str.charAt(i)]=-2;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<isVisited.length; i++){
            if(isVisited[i]>0){
                res = Math.min(res, isVisited[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1: res;
    }

    
}
