package com.patterns.multiple;

import java.util.HashMap;

public class MultipleSingleton {
    private static final HashMap<String, MultipleSingleton> instanceMap = new HashMap<>();
    private static final String[] NAMES = {"A", "B", "C"};
    private static int turn = 0;
    private final String name;

    private MultipleSingleton(String name) {
        this.name = name;
    }

    public static MultipleSingleton getInstance() {
        if (MultipleSingleton.instanceMap.size() < NAMES.length) {
            MultipleSingleton.instanceMap.put(NAMES[turn], new MultipleSingleton(NAMES[turn]));
        }
        int turn = MultipleSingleton.turn;
        MultipleSingleton.turn = (MultipleSingleton.turn + 1) % NAMES.length;
        MultipleSingleton instance = MultipleSingleton.instanceMap.get(NAMES[turn]);
        System.out.println(instance);
        return instance;
    }

    public void m() {
        System.out.println("Ejecución m de multiple objeto: " + this.name);
    }
}
