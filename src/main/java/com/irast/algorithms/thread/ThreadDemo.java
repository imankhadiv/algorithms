package com.irast.algorithms.thread;

public class ThreadDemo {

    public static void main(String[] args) {

        RunnableDemo a = new RunnableDemo("tA");
        RunnableDemo b = new RunnableDemo("tB");

        a.start();
        b.start();
    }
}
