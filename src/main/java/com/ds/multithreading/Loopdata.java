package com.ds.multithreading;

import java.util.concurrent.TimeUnit;

public class Loopdata implements Runnable {
    private static int instances = 0;
    private String taskId;

    @Override
    public void run() {
        String currentThread = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println("<" + taskId + ">tik tik " + i + currentThread);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Loopdata() {
        this.taskId = "loopTask" + instances;
    }
}
