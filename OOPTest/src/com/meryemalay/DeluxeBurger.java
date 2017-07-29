package com.meryemalay;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & bacon", 10.76, "white");
        super.addHamburgeAddition1("Chips", 2.78);
        super.addHamburgeAddition2("Drinks", 1.98);
    }

    @Override
    public void addHamburgeAddition1(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }

    @Override
    public void addHamburgeAddition2(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }

    @Override
    public void addHamburgeAddition3(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }

    @Override
    public void addHamburgeAddition4(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }
}
