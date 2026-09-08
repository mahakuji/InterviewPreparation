package com.mahakuji.oops.inheritance;

public class Animal {
    int x = 10;
    int numberOfLegs;
    int eyes;
    String colorOfEyes;

    Animal() {
        numberOfLegs = 4;
        eyes = 2;
        colorOfEyes = "Black";
    }

    Animal(int numberOfLegs, int eyes, String colorOfEyes){
        this.numberOfLegs = numberOfLegs;
        this.eyes = eyes;
        this.colorOfEyes = colorOfEyes;
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }

    void show(){
        System.out.println("Showing Animal");
    }
}
