package com.meryemalay;

public class Main {

    public static void main(String[] args) {
	    Gearbox mcLaren = new Gearbox(6);
	    Gearbox.Gear first = mcLaren.new Gear(2, 15.4);
        System.out.println(first.driveSpeed(1000));
    }
}
