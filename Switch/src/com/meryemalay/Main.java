package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if(value == 1){
            System.out.println("Value was 1!");
        }else if(value == 2){
            System.out.println("Values was 2");
        }else {
            System.out.println("Value was not 1 or 2");
        }

        //The switch statement can be used four primitives types,
        //byte, short, char and int

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Switch value is 1");
                break;

            case 2:
                System.out.println("Switch value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Switch value is 3 or 4 or 5");
                System.out.println("Actually it is "+switchValue);
                break;

            default:
                System.out.println("It is not 1,2,3,4 or 5");
                break;
        }

        System.out.println("in here");

        char charValue = 'W';
        switch (charValue){
            case 'A':
                System.out.println("Char Value is A");
                break;
            case 'B':
                System.out.println("Char Value is B");
                break;
            case 'C':
                System.out.println("Char Value is C");
                break;
            case 'D':
                System.out.println("Char Value is D");
                break;
            case 'E':
                System.out.println("Char Value is E");
                break;
            default:
                System.out.println("Char Value is not A, B, C, D, E");
                break;
        }

        //In JDK version 7, They added to capability of using the swith statement with string

        String month = "JaNuaRya";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "may":
                System.out.println("May");
                break;
            case "november":
                System.out.println("Nov");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
