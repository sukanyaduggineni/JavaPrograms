package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        //primitives data types
        //1. byte
        //2. short
        //3. int
        //4. long
        //5. float
        //6. double
        //7. char
        //8. boolean

        String myString = "This is a string";
        System.out.println("my string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("my string is equal to " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println("my string is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println("The result is  " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to "+ lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to "+ lastString);

    }
}
