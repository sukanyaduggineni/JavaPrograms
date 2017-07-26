package com.meryemalay;

public class Main {

    public static void main(String[] args) {
	    //Classes: State -> Variables and Behavior -> Methods
        Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Model is "+ porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is "+ porsche.getModel());
    }
}
