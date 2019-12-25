package com.twoot.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        //test for the EagerInit

        testSingletonEagerInit();
        testSingletonLazyInit();
        testSingletonSynchronizedLazyInit();
        testSingletonSynchronizedImprovedLazyInit();
    }

    private static void testSingletonSynchronizedImprovedLazyInit() {
        SingletonSynchronizedImprovedLazyInit singletonSynchronizedImprovedLazyInit = SingletonSynchronizedImprovedLazyInit.getInstance();
        SingletonSynchronizedImprovedLazyInit singletonSynchronizedImprovedLazyInit2 = SingletonSynchronizedImprovedLazyInit.getInstance();

        StringBuilder result = new StringBuilder((singletonSynchronizedImprovedLazyInit == singletonSynchronizedImprovedLazyInit2) ? "Both Are Equal \n" : "Both Are Not Equal ")
                .append("SingletonLazyInit1 = " + singletonSynchronizedImprovedLazyInit + "\t" + "SingletonLazyInit2 = " + singletonSynchronizedImprovedLazyInit2);


        System.out.println(result);
    }

    private static void testSingletonSynchronizedLazyInit() {
        SingletonSynchronizedLazyInit singletonSynchronizedLazyInit = SingletonSynchronizedLazyInit.getInstance();
        SingletonSynchronizedLazyInit singletonSynchronizedLazyInit2 = SingletonSynchronizedLazyInit.getInstance();

        String result = (singletonSynchronizedLazyInit == singletonSynchronizedLazyInit2) ? "Both Are Equal \n" + singletonSynchronizedLazyInit : "Both Are Not Equal " + singletonSynchronizedLazyInit + " And " + singletonSynchronizedLazyInit2;
        System.out.println(result);
    }

    private static void testSingletonLazyInit() {
        SingletonLazyInit singletonLazyInit = SingletonLazyInit.getInstance();
        SingletonLazyInit singletonLazyInit2 = SingletonLazyInit.getInstance();

        StringBuilder result = new StringBuilder((singletonLazyInit == singletonLazyInit2) ? "Both Are Equal \n" : "Both Are Not Equal ")
                .append("SingletonLazyInit1 = " + singletonLazyInit + "\t" + "SingletonLazyInit2 = " + singletonLazyInit2);


        System.out.println(result);
    }

    private static void testSingletonEagerInit() {
        SingletonEagerInit singletonEagerInitInstance = SingletonEagerInit.getInstance();
        SingletonEagerInit singletonEagerInitInstance2 = SingletonEagerInit.getInstance();

        String result = (singletonEagerInitInstance == singletonEagerInitInstance2) ? "Both Are Equal \n" + singletonEagerInitInstance : "Both Are Not Equal " + singletonEagerInitInstance + " And " + singletonEagerInitInstance2;
        System.out.println(result);
    }
}