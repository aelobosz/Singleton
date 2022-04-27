package com.patterns.inheritance;

import java.time.LocalDateTime;

public abstract class Singleton {
    private static Singleton instance = null;

    protected Singleton(){
    }

    public static Singleton getInstance() {
        if (Singleton.instance == null)
            try {
                Singleton.instance = (Singleton) (Class.forName(className())).newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }

        return instance;
    }

    private int attribute;

    public void m() {
        System.out.println("Singleton abstract");
    }

    /**
     * Simula la lectura de algun archivo de confuguracion que nos diga con que instancia se debe inciar el app
     * @return nombre de la clase a ser instanciada
     */
    private static String className() {
        final int random = LocalDateTime.now().getSecond();
        if (random % 2 == 0) {
            return ASingleton.class.getName();
        } else {
            return BSingleton.class.getName();
        }
    }
}
