package com.test.interfaceLogic;

public interface A {
    default void greet() {
        System.out.println("Welcome");
    }

    void print();
}
