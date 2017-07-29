package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(8, "Mercedes");
        mercedes.startEngine();

        LandRover landRover = new LandRover(6, "LandRover");
        landRover.startEngine();

        Bmw bmw = new Bmw(8, "Bmw");
        bmw.startEngine();
    }
}

class Car {

        private boolean engine;
        private int cylinders;
        private int wheels;
        private String name;

        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.engine = true;
            this.wheels = 4;
        }

        public void startEngine(){
            System.out.println("Car: Engine starting...");
        }

        public void accelarate(){
            System.out.println("accelareting car...");
        }

        public void brake(){
            System.out.println("braking car....");
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }
    }

    class Mercedes extends Car {
        public Mercedes(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void startEngine() {
            System.out.println("Mercedes starting");
        }
    }


    class Bmw extends Car {
        public Bmw(int cylinders, String name) {
            super(cylinders, name);
        }
    }

    class LandRover extends Car {
        public LandRover(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void startEngine() {
            System.out.println(getClass().getSimpleName()+ "... Land Rover starting...");
        }
    }


