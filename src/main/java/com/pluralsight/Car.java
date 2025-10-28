package com.pluralsight;

import java.util.ArrayList;

public class Car extends Vehicle{
    private Trunk trunk;

//    public Car() {
//    }

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, Trunk trunk) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.trunk = trunk;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }
}
