package com.patterns.inheritance;

public class BSingleton extends Singleton {
    protected BSingleton() {
        super();
    }
    @Override
    public void m() {
        System.out.println("SingletonB");
    }
}
