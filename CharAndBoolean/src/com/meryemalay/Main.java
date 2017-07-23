package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char myChar = 'a';
        char myUniCode = '\u00A9';

        System.out.println("Unicode output was : "+ myUniCode);

        boolean myBoolean = false;
        boolean isMale = true;

        //challenge
        char registeredSymbol = '\u00AE';
        System.out.println("Registred Symbol: "+ registeredSymbol);
    }
}
