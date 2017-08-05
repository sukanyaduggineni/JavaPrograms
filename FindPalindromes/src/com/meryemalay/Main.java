package com.meryemalay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        printAllPalindrome("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop");

    }

   public static String reverse(String str){
        String reverseString = "";
       for (int i = str.length() -1; i >= 0; i--) {
            reverseString += str.substring(i, i+1);
       }
       return reverseString;
   }

   public static boolean isPalindrom(String str){

       return str.equals(reverse(str));
   }

    public static void printAllPalindrome(String str) {
        ArrayList<String> palindroms = new ArrayList<>();
        int i = 0;
        while(i < str.length() -1) {
            for (int j = str.length() - 1; j > i; j--) {
                if(str.substring(i, i+2).equals(reverse(str.substring(j-1, j+1)))){
                    if(isPalindrom(str.substring(i, j+1))){
                        palindroms.add(str.substring(i, j+1));
                        System.out.println("hello: " + str.substring(i, j+1));
                        i += (j - i + 1) / 2;
                        break;
                    }
                }
            }
            i++;
        }
    }

}
