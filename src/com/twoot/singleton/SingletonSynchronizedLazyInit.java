package com.twoot.singleton;

public class SingletonSynchronizedLazyInit {
    private static SingletonSynchronizedLazyInit singletonSynchronizedLazyInit;

    private SingletonSynchronizedLazyInit() {
    }

    public static synchronized SingletonSynchronizedLazyInit getInstance() {
        return (null == singletonSynchronizedLazyInit) ? singletonSynchronizedLazyInit = new SingletonSynchronizedLazyInit() : singletonSynchronizedLazyInit;
    }
}
