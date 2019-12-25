package com.twoot.singleton;

public class SingletonEagerInit {
    private static SingletonEagerInit singletonEagerInitInstance = new SingletonEagerInit();

    private SingletonEagerInit() {
    }

    public static SingletonEagerInit getInstance() {
        return singletonEagerInitInstance;
    }
}
