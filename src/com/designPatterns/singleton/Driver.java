package com.designPatterns.singleton;

public class Driver {
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.print();
        LazySingleton singleton1 = LazySingleton.getInstance();
        singleton1.print();
    }
}
