package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameover, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameover, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        int higScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Jack" , higScorePosition);

        higScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Michael" , higScorePosition);

        higScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tim" , higScorePosition);

        higScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Meryem" , higScorePosition);
    }

    public static int calculateScore(boolean gameover, int score, int levelCompleted, int bonus){

        if(gameover){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName+" managed to get into position "
                +position
                +" on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }else if(score >= 500 && score <1000){
            return 2;
        }else if(score >= 100 && score <500){
            return 3;
        }else{
            return 4;
        }

    }
}
