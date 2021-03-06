package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Initializing the variables that requared//
    int scoreTeamA = 0, scoreTeamB = 0, countA = 0, countB = 0;

    //increment Score 3 for team A//
    public void incementA3(View view) {
        scoreTeamA += 3;
        countA += 1;
        countDisplayA(countA);
        displayA(scoreTeamA);
    }

    //Increment Score 3 for team B//
    public void incementB3(View view) {
        scoreTeamB += 3;
        countB += 1;
        countDisplayB(countB);
        displayB(scoreTeamB);
    }

    ////Increment Score 2 for team A//
    public void incementA2(View view) {
        scoreTeamA += 2;
        countA += 1;
        countDisplayA(countA);
        displayA(scoreTeamA);
    }

    //Increment Score 2 for team B//
    public void incementB2(View view) {
        scoreTeamB += 2;
        countB += 1;
        countDisplayB(countB);
        displayB(scoreTeamB);
    }

    //Increment Score 1 for team A//
    public void freeThrowA(View view) {
        scoreTeamA += 1;
        countA += 1;
        countDisplayA(countA);
        displayA(scoreTeamA);
    }

    //Increment Score 1 for team B//
    public void freeThrowB(View view) {
        scoreTeamB += 1;
        countB += 1;
        countDisplayB(countB);
        displayB(scoreTeamB);
    }

    //Reset all the values//
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        countA = 0;
        countB = 0;
        countDisplayB(countB);
        countDisplayA(countA);
        displayA(scoreTeamA);
        displayB(scoreTeamB);
    }

//Update the Score for team A//
    private void displayA(int scoreA) {
        TextView score = (TextView) findViewById(R.id.textViewA2);
        score.setText(String.valueOf(scoreA));
    }

//Update the score for team B//
    private void displayB(int scoreB) {
        TextView score = (TextView) findViewById(R.id.textViewB2);
        score.setText(String.valueOf(scoreB));
    }

//Update the goal count for team A//
    private void countDisplayA(int countA) {
        TextView count = (TextView) findViewById(R.id.textViewA3);
        count.setText(String.valueOf(countA));
    }

//Update the goal count for team B//
    private void countDisplayB(int countB) {
        TextView count = (TextView) findViewById(R.id.textViewB3);
        count.setText(String.valueOf(countB));
    }

//end of maim method //
}