package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase score of team A by 2
     */
    public void addTakedownForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase score of team A by 2
     */
    public void addReversalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase score of team A by 1
     */
    public void addEscapeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase score of team A by 2
     */
    public void addNearfallForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase score of team B by 1
     */
    public void PenaltyOneForTeamA(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * decrease score of team B by 2
     */
    public void PenaltyTwoForTeamA(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * display score for team A
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreTeamA = (TextView) findViewById(R.id.score_TeamA);
        scoreTeamA.setText(String.valueOf(score));
    }


    /**
     * Increase score of team B by 2
     */
    public void addTakedownForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase score of team B by 2
     */
    public void addReversalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase score of team B by 1
     */
    public void addEscapeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase score of team B by 2
     */
    public void addNearfallForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase score of team A by 1 as its a penalty on team B
     */
    public void PenaltyOneForTeamB(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase score of team A by 2 as its a penalty on team B
     */
    public void PenaltyTwoForTeamB(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * display score for team B
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreTeamB = (TextView) findViewById(R.id.score_TeamB);
        scoreTeamB.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
    }
}
