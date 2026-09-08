package com.mahakuji.oops.singleton;

public class Singleton {

    public int age;
    private Singleton(int age){
        this.age = age;
    }

    static Singleton instance;

    public static Singleton getInstance(int age){
        if(instance == null){
            instance = new Singleton(age);
        }
        return instance;
    }

}
