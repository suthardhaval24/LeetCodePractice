package com.designPatterns.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("Eager Singleton");
    }


    /**The above method works fine, but it has one drawback. The instance
     * is created irrespective of it is required in runtime or not. If this
     * instance is not a big object and you can live with it being unused, this is the best approach.**/
}
