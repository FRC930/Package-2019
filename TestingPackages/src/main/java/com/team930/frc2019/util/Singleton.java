package com.team930.frc2019.util;

public abstract class Singleton {

    private static Object instance;

    public static Object getInstance() {
        if (instance == null) {
            instance = new Object();
       }
       return instance;
    }

}