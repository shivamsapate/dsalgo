package com.ds.multithreading.executorservice;

import com.ds.multithreading.Loopdata;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NamingExecutor {
    public static void main(String... args){
        System.out.println("Main Thread started");
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Loopdata());
        executorService.execute(new Loopdata());
        executorService.execute(new Loopdata());
        System.out.println("Main thread ended");
    }
}
