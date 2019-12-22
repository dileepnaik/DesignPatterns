package com.twoot.singleton;

public class SingletonSynchronizedImprovedLazyInit {
    private static SingletonSynchronizedImprovedLazyInit singletonSynchronizedImprovedLazyInit;

    private SingletonSynchronizedImprovedLazyInit() {
    }

    public static SingletonSynchronizedImprovedLazyInit getInstance() {
        if (null == singletonSynchronizedImprovedLazyInit) {
            synchronized (SingletonSynchronizedImprovedLazyInit.class) {
                if (singletonSynchronizedImprovedLazyInit == null) {
                    singletonSynchronizedImprovedLazyInit = new SingletonSynchronizedImprovedLazyInit();
                }
            }
        }
        return singletonSynchronizedImprovedLazyInit;
    }
}
