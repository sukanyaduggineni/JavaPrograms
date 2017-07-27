package com.meryemalay;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution natureResolution;

    //Monitor is not a Resolution but it has a Resolution!!!
    //This is composition

    public Monitor(String mode, String manufacturer, int size, Resolution natureResolution) {
        this.model = mode;
        this.manufacturer = manufacturer;
        this.size = size;
        this.natureResolution = natureResolution;
    }

    public void drawPixelAt(int x, int y, String colour){
        System.out.println("Drawing pixel at " + x + ", "+ y +" colour "+colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNatureResolution() {
        return natureResolution;
    }
}
