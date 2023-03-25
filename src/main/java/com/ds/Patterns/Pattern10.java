package com.ds.Patterns;

import java.util.Scanner;
// 7
//    *
//   *  *
//  *    *
// *      *
//  *    *
//   *  *
//    *
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaceFirst = n/2;
        int spaceMid = 0;

        for(int i = 1; i <=n; i++){
            for(int spf=0; spf<spaceFirst; spf++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int spm=0; spm<spaceMid; spm++){
                System.out.print(" ");
            }
            if(i!=1 && i!=n)
                System.out.print("*");

            if(i<=n/2){
                spaceFirst--;
                spaceMid+=2;
            } else{
                spaceFirst++;
                spaceMid-=2;
            }
            System.out.println();
        }
    }
}
