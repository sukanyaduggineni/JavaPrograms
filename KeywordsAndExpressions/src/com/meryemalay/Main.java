package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        // Expressions are essentially building blocks of all Java Programs
        double kilometres = (100 * 1.609344);
        // The expression component is variables, values and operators.

        int highScore = 50;
        //within the brackests are expression.
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        //challange
        int score = 100; // The score equals a hundred component is the expression.
        //Data type and also semicolon to the end the line are not part of the expression.
        if(score > 99){
            System.out.println("You got the high socore!");
            score = 0;
        }
    }
}
