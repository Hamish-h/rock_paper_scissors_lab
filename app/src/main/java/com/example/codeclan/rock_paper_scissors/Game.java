package com.example.codeclan.rock_paper_scissors;

import java.util.Random;

public class Game {

    ChoiceType playerChoice;
    ChoiceType androidChoice;

    public Game(ChoiceType playerChoice, ChoiceType androidChoice){
        this.playerChoice = playerChoice;
        this.androidChoice = androidChoice;
    }

    public void setPlayerChoice(ChoiceType choice){
        this.playerChoice = choice;
    }

    public ChoiceType randomiseAndroidChoice(){
        ChoiceType[] arr = {ChoiceType.PAPER, ChoiceType.ROCK, ChoiceType.SCISSORS};
        Random choice = new Random();
        int select = choice.nextInt(arr.length);
        return arr[select];
    }

    public void setAndroidChoice(ChoiceType choice){
        choice = randomiseAndroidChoice();
        this.androidChoice = choice;
    }

    public ChoiceType getPlayerChoice(){
        return playerChoice;
    }

    public ChoiceType getAndroidChoice(){
        return androidChoice;
    }


   public String getWinner() {
       ChoiceType player = getPlayerChoice();
       ChoiceType android = getAndroidChoice();

       if (player == android) {
           return "The game is a draw";
       } else if ((player == ChoiceType.ROCK) && (android == ChoiceType.PAPER)) {
           return "Android Wins!!";
       } else if ((player == ChoiceType.ROCK) && (android == ChoiceType.SCISSORS)) {
           return "Player Wins!!";
       } else if ((player == ChoiceType.PAPER) && (android == ChoiceType.SCISSORS)) {
           return "Android Wins!!";
       } else if ((player == ChoiceType.PAPER) && (android == ChoiceType.ROCK)) {
           return "Player Wins!!";
       } else if ((player == ChoiceType.SCISSORS) && (android == ChoiceType.ROCK)) {
           return "Android Wins!!";
       } else {
           return "Player Wins!!";
       }
   }
}
