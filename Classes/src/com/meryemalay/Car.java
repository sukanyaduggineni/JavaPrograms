package com.meryemalay;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engin;
    private String colour;

    public void setModel(String model){
        //We could do some validation
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
