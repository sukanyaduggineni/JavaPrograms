package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        // literal
        //int has a width of 32
	    int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
	    //expression
	    int myTotal = (myMinValue/2);
        System.out.println("myTotal: "+ myTotal);

	    //byte has a width of 8
        //in the range of -128 to 127
        byte myByte = -128;
        byte myNewByte = (byte)(myByte / 2);
        System.out.println("myNewByte: " + myNewByte);

        //short has a width of 16
        short myShort = 32767;
        short myNewShortValue = (short)(myShort / 2);
        System.out.println("myNewShortValue: " + myNewShortValue);

        //long has a width 0f 64
        long myLong = 100L;
        long myMaxLong = 9_223_372_036_854_775_807L;
        long myMinLong = -9_223_372_036_854_775_808L;

        //challenge
        byte byteNum = 10;
        short shortNum = 20;
        int intNum = 50;
        long longNum = 50000L + 10L * (byteNum + shortNum + intNum);
        short shortTotal = (short)(1000 + 10 * (byteNum + shortNum + intNum));

        System.out.println("longNum: " + longNum);
        System.out.println("shortTotal: " + shortTotal);


    }
}
