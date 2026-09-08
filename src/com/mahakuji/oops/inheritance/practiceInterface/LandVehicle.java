package com.mahakuji.oops.inheritance.practiceInterface;

import com.mahakuji.oops.inheritance.Animal;

public interface LandVehicle {
    default void run() {
        System.out.println("Running on Land");
    }

    int wheels = 4;

    void speed();
    void maintenance();
}
