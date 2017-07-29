package com.meryemalay;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 2.76,"White");
	    hamburger.itimizeHamburger();
	    hamburger.addHamburgeAddition1("Tomato", 0.34);
        hamburger.addHamburgeAddition1("Lettuce", 0.12);
        hamburger.addHamburgeAddition1("Cheese", 1.04);
        System.out.println("Total burger price: "+ hamburger.itimizeHamburger());
    }
}
