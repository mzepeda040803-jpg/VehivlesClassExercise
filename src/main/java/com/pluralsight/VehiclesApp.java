package com.pluralsight;

public class VehiclesApp {

    public static void main(String[] args) {
        Moped moped = new Moped();
        moped.setColor("Blue");
        System.out.println(moped.getColor());

        Car car = new Car();
        car.setColor("Orange");
        car.setFuelCapacity(16);

        System.out.println("The color of the car is: " + car.getColor() + "The fuel capacity is: " + car.getFuelCapacity());
        System.out.println(car.getTrunk());

        Hovercraft hovercraft = new Hovercraft();
        System.out.println(hovercraft);

    }
}
