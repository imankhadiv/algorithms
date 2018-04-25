package com.irast.algorithms.thread;

public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true)
            System.out.println(threadName);
    }
    public void start() {
        if(t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
