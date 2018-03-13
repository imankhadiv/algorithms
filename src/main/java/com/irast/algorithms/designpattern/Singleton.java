package com.irast.algorithms.designpattern;

public class Singleton {
    /**
     * lazy load singleton instance
     */
    private static volatile Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }
        return instance;
    }
}
