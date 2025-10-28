package com.pluralsight;

import java.util.ArrayList;

public class Moped extends Vehicle {
    private boolean hasKickstand;



    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, boolean hasKickStand) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, new ArrayList<>());
        this.hasKickstand = hasKickStand;


    }
}
