package com.patterns.multiple;

import java.util.ArrayList;
import java.util.List;

public class MultipleSingleton {
    private static final List<MultipleSingleton> instanceList = new ArrayList<>();
    private static final String[] NAMES = {"A", "B", "C"};
    private static int turn = 0;
    private final String name;

    private MultipleSingleton(String name) {
        this.name = name;
    }

    public static MultipleSingleton getInstance() {
        if (MultipleSingleton.instanceList.size() < NAMES.length) {
            MultipleSingleton.instanceList.add(new MultipleSingleton(NAMES[turn]));
        }
        int turn = MultipleSingleton.turn;
        MultipleSingleton.turn = (MultipleSingleton.turn + 1) % NAMES.length;
        MultipleSingleton instance = MultipleSingleton.instanceList.get(turn);
        System.out.println(instance);
        return instance;
    }

    public void m() {
        System.out.println("Ejecución m de multiple objeto: " + this.name);
    }
}
