package com.twoot.singleton;

public class SingletonLazyInit {
    private static SingletonLazyInit singletonLazyInit;

    private SingletonLazyInit() {
    }

    public static SingletonLazyInit getInstance() {
        return (null == singletonLazyInit) ? singletonLazyInit = new SingletonLazyInit() : singletonLazyInit;
    }
}
