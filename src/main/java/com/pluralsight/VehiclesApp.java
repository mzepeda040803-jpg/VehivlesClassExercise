package com.pluralsight;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class VehiclesApp {

    public static void main(String[] args) {
        Moped moped = new Moped("Blue", 1, 0, 5, new ArrayList<Wheel>(), true);
        moped.setColor("Blue");

        System.out.println(moped.getColor());

        Car car = new Car("red", 4, 5, 16, new ArrayList<Wheel>(), new Trunk());
        car.setColor("Orange");
        car.setFuelCapacity(16);

        System.out.println("The color of the car is: " + car.getColor() + "The fuel capacity is: " + car.getFuelCapacity());
        System.out.println(car.getTrunk());

//        SemiTruck truck = new SemiTruck();
//        System.out.println(truck);

//        Hovercraft hovercraft = new Hovercraft();
//        System.out.println(hovercraft);

    }
}
