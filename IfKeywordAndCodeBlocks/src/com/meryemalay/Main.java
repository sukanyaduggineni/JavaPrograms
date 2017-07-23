package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        //command: go up to the Code menu
        // shortcut: cmd + /
        int finalScore;
        if(gameover){
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //int newFinalScore = finalScore;
        //scope deals with accessibility of variables in certain situations

        //challange
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameover){
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
