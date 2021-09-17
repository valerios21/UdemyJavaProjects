package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        calculateScore(true, 5000, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("George", highScorePosition);

    }


    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");


    }

    public static int calculateHighScorePosition (int playerScore){

//        if(playerScore >= 1000){
//            return 1;
//        }else if (playerScore >= 500){
//            return 2;
//        }else if (playerScore >= 100){
//            return 3;
//        }
//        return 4;

        int position = 4; // assuming position 4 will be returned

        if(playerScore >=1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return  position;
    }




    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

}
