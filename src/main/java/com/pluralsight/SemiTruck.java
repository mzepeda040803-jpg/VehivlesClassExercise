package com.pluralsight;

import java.util.ArrayList;

public class SemiTruck extends Vehicle{
    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
    }
}
