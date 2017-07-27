package com.meryemalay;

public class Television {

    private String manufacturer;
    private int size;

    public Television(String manufacturer, int size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public void pressedButton(){
        System.out.println("TV is opeing....");
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }
}
