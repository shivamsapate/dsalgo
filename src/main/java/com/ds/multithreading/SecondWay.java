package com.ds.multithreading;

import java.util.concurrent.TimeUnit;

public class SecondWay {
    public static void main(String[] args) {
        System.out.println("Main threads start here");
        new SecondTask().start();
        Thread t = new SecondTask();
        t.start();

        System.out.println("Main threads start here");

    }
}

class SecondTask extends Thread {
    private static int count = 0;
    private int id;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("<" + id + ">tik tik " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    SecondTask() {
        this.id = count++;
        this.start();
    }
}