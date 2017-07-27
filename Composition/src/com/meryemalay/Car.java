package com.meryemalay;

public class Car extends Vehicle{

    private int doors;
    private int enginCapacity;

    public Car(String name, int doors, int enginCapacity) {
        super(name);
        this.doors = doors;
        this.enginCapacity = enginCapacity;
    }

    //The Car extends from Vehicle.
    //It's got is a relationship with vehicle.
    //Is a meaning that a Car is a Vehicle.
}
