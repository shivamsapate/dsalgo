package com.ds.Inter;

import java.util.Scanner;

public class SecondHigest {
    public static void main(String[] args) {
        int arr[] = { 11,11,12,12 };

        int max = arr[0];
        int secondMax = arr[0];

        for (int val : arr) {
            if (val > max) {
                secondMax = max;
                max = val;
            } else if (val > secondMax && val != max) {
                secondMax = val;
            } 
        }
        System.out.println(secondMax);

    }
}
