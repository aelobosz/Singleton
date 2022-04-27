package com.patterns.simple;

import com.patterns.inheritance.Singleton;

public class SimpleSingleton {
    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (SimpleSingleton.instance == null)
           SimpleSingleton.instance = new SimpleSingleton();

        return instance;
    }

    private int attribute;

    public void m() {
        System.out.println("Singleton");
    }
}

