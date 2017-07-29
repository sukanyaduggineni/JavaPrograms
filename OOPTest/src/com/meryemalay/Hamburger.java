package com.meryemalay;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addtion1Price;

    private String addition2Name;
    private double addtion2Price;

    private String addition3Name;
    private double addtion3Price;

    private String addition4Name;
    private double addtion4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgeAddition1(String name, double price){
        this.addition1Name = name;
        this.addtion1Price = price;
    }

    public void addHamburgeAddition2(String name, double price){
        this.addition2Name = name;
        this.addtion2Price = price;
    }

    public void addHamburgeAddition3(String name, double price){
        this.addition3Name = name;
        this.addtion3Price = price;
    }

    public void addHamburgeAddition4(String name, double price){
        this.addition4Name = name;
        this.addtion4Price = price;
    }

    public double itimizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with "+this.meat+", price is "
            + this.price);
        if(this.addition1Name != null){
            hamburgerPrice += this.addtion1Price;
            System.out.println("Added "+ this.addition1Name + " for an extra " + this.addtion1Price);
        }
        if(this.addition2Name != null){
            hamburgerPrice += this.addtion2Price;
            System.out.println("Added "+ this.addition2Name + " for an extra " + this.addtion2Price);
        }
        if(this.addition3Name != null){
            hamburgerPrice += this.addtion3Price;
            System.out.println("Added "+ this.addition3Name + " for an extra " + this.addtion3Price);
        }
        if(this.addition4Name != null){
            hamburgerPrice += this.addtion4Price;
            System.out.println("Added "+ this.addition4Name + " for an extra " + this.addtion4Price);
        }

        return hamburgerPrice;
    }
}
