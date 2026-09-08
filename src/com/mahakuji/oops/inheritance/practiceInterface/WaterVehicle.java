package com.mahakuji.oops.inheritance.practiceInterface;

public interface WaterVehicle {
    default void run(){
        System.out.println("Swim in the ocean");
    }
    int wheels = 2;
    void speed();
    void maintenance();
}
