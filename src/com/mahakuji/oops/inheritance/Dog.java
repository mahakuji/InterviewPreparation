package com.mahakuji.oops.inheritance;

public class Dog extends Animal {

    int y = 20;

    @Override
    void show() {
        System.out.println("Showing Dog");
    }

    public Dog(){
        this(4, 2, "green");
    }

    public Dog(int legs, int eyes, String color) {
        super(legs, eyes, color);
    }

    @Override
    void sleep(){
        System.out.println("sleeping outside");
    }
}
