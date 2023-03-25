package com.ds.multithreading;

import java.util.concurrent.TimeUnit;

public class FirstWay {
    public static void main(String[] args) {
        System.out.println("Main threads start here");
        new FirstTask();

        System.out.println("Main threads start here");

    }
}

class FirstTask extends Thread {
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

    FirstTask() {
        this.id = count++;
        this.start();
    }
}