package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        //You might not know how many times you want to loop ahead of time!
        //It's got the other advantage that it will always execute at least one
	    int count = 6;
	    while (count != 6){
            System.out.println("value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("value is " + i);
        }

        count = 4;
        do{
            System.out.println("value is " + count);
            count++;
        }while(count != 6);

        count = 6;
	    while (true){
	        if(count == 6){
                break;
            }
            System.out.println("value is " + count);
            count++;
        }

        int number = 4;
	    int finishNumber = 20;
        int k = 0;
	    while(number <= finishNumber){
            number++;
	        if(!isEven(number)){
	            continue;
            }

            System.out.println("Even Number: "+ number);
	        k++;
	        if(k==5) {
                break;
            }
        }
        System.out.println("Total even number found: "+ k);

    }

    public static boolean isEven(int number){
        if((number % 2) == 0)
            return true;
        else
            return false;
    }
}
