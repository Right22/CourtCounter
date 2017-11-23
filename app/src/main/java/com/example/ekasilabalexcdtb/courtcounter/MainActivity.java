package com.example.ekasilabalexcdtb.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    //This method increase the score for team A by 3 points.
    public void addThreeForTeamA(View view){
        displayForTeamA(scoreTeamA = scoreTeamA + 3);
    }
    //This method increase the score for team A by 2 points.
    public void addTwoForTeamA(View view){
        displayForTeamA(scoreTeamA = scoreTeamA + 2);
    }
    //This method increase the score for team A by 1 points.
    public void addOneForTeamA(View view){
        displayForTeamA(scoreTeamA = scoreTeamA + 1);
    }
    //
    //This method increment the score for team B by 3 points.
    public void addThreeForTeamB(View view){
        displayForTeamB(scoreTeamB = scoreTeamB + 3);
    }
    //This method increment the score for team B by 2 points.
    public void addTwoForTeamB(View view){
        displayForTeamB(scoreTeamB = scoreTeamB + 2);
    }
    //This method increment the score for team B by 1 points.
    public void addOneForTeamB(View view){
        displayForTeamB(scoreTeamB = scoreTeamB + 1);
    }
    //This method reset score for both teams back to 0
    public void resetScore(View view){
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }
    /**
     * Display method is going to display score for Team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //Display score for Team B
    public void displayForTeamB(int score){
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
}
