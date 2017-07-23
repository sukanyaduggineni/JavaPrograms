package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoublevalue: " + myDoubleValue);

        //challange

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("convertedKilograms: " + convertedKilograms);

        double test = 33_434_234.343_243_24d;
    }
}
