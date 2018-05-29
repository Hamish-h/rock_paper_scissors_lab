package com.example.codeclan.rock_paper_scissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView playerChoice, androidsChoice, gameResult;
    Button rockButton, paperButton, scissorsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerChoice = findViewById(R.id.player_choice);
        androidsChoice = findViewById(R.id.android_choice);
        gameResult = findViewById(R.id.game_result);
        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);

    }


    public void onClickRockButton(View button){
        playerChoice.setText("Player picked ROCK");

        Game game = new Game(ChoiceType.ROCK, ChoiceType.ROCK);
        ChoiceType androidChoice = game.randomiseAndroidChoice();
        game.setAndroidChoice(androidChoice);
        ChoiceType choice = game.getAndroidChoice();
        androidsChoice.setText("Android chose " + choice.toString());

        String winner = game.getWinner();


        gameResult.setText(winner);
    }

    public void onClickPaperButton(View button){
        playerChoice.setText("Player picked PAPER");


        Game game = new Game(ChoiceType.PAPER, ChoiceType.PAPER);
        ChoiceType androidChoice = game.randomiseAndroidChoice();
        game.setAndroidChoice(androidChoice);
        ChoiceType choice = game.getAndroidChoice();
        androidsChoice.setText("Android chose " + choice.toString());


        String winner = game.getWinner();

        gameResult.setText(winner);
    }

    public void onClickScissorsButton(View button){
        playerChoice.setText("Player picked SCISSORS");

        Game game = new Game(ChoiceType.SCISSORS, ChoiceType.SCISSORS);
        ChoiceType androidChoice = game.randomiseAndroidChoice();
        game.setAndroidChoice(androidChoice);
        ChoiceType choice = game.getAndroidChoice();
        androidsChoice.setText("Android chose " + choice.toString());

        String winner = game.getWinner();

        gameResult.setText(winner);
    }

}
