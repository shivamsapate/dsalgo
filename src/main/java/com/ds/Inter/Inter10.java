package com.ds.Inter;

import java.util.Arrays;
import java.util.Scanner;

public class Inter10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
