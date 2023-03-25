package com.ds.multithreading.namingthread;

import com.ds.multithreading.Loopdata;

public class FirstWay {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread starts here...");

        new Thread(new Loopdata()).start();
        new Thread(new Loopdata()).start();

        System.out.println("Main thread ends here");
    }
}
