package com.mahakuji.oops.inheritance.practiceInterface;

public class AmphibiousVehicle implements LandVehicle, WaterVehicle{

    @Override
    public void run() {
        System.out.println("Can run on water and swin in the ocean with " + WaterVehicle.wheels + " wheels");
    }

    @Override
    public void speed() {

    }

    @Override
    public void maintenance() {

    }

    public static void main(String[] args) {
        AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle();
        amphibiousVehicle.run();
    }
}
