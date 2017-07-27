package com.meryemalay;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeht;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeht, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeht = teeht;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
