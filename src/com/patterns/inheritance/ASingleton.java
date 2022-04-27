package com.patterns.inheritance;

public class ASingleton extends Singleton {
    protected ASingleton(){
        super();
    }

    @Override
    public void m() {
        System.out.println("SingletonA");
    }
}
