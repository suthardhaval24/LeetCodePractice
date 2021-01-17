package com.test.interfaceLogic;

public interface C {

    default void bye() {
        System.out.println("Bye");
    }
}
