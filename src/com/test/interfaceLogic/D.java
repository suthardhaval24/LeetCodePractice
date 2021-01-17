package com.test.interfaceLogic;

public class D implements B {

    @Override
    public void show() {
        System.out.println("Class D is  overiding B");
    }

    @Override
    public void print() {
        System.out.println("Class D is overriding A");
    }
}
