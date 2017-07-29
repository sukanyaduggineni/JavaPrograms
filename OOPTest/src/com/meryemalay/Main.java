package com.meryemalay;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 2.76,"White");
	    hamburger.itimizeHamburger();
	    hamburger.addHamburgeAddition1("Tomato", 0.34);
        hamburger.addHamburgeAddition1("Lettuce", 0.12);
        hamburger.addHamburgeAddition1("Cheese", 1.04);
        System.out.println("Total burger price: "+ hamburger.itimizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 2.99);
        healthyBurger.addHealthExtra1("eggs", 4.1);
        healthyBurger.addHamburgeAddition1("lentils", 2.12);
        System.out.println("Total healthy burger price: "+ healthyBurger.itimizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgeAddition3("egg", 33);
        System.out.println("Total healthy burger price: "+ db.itimizeHamburger());
    }

}
