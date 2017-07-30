package com.meryemalay;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] array = getIntegers(5);
	    int[] sortedArray = sortArray(array);
	    printArray(sortedArray);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array " + i + ". element is "+ array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            sortedArray[i] = array[i];
        }

        int temp;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
