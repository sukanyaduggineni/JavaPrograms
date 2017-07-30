package com.meryemalay;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//	    int[] myIntArray = new int[10];
//	    myIntArray[0] = 1;
//	    myIntArray[1] = 2;
//        System.out.println(myIntArray[1]);
//
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[0] = 1.0;
//        myDoubleArray[1] = 2.0;
//        myDoubleArray[2] = 3.0;
//        System.out.println(myDoubleArray[2]);

//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(myIntArray[4]);

        int[] myIntArray = new int[30];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        //printArray(myIntArray);

        int[] array = getInteger(5);
        printArray(array);

        System.out.println("Average: " + getAverage(array));


    }

    public static int[] getInteger(int number){
        System.out.println("Enter " + number + " integer values...\r");
        int[] array = new int[number];

        for (int i = 0; i < array.length ; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " +i + ", values is " + array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
