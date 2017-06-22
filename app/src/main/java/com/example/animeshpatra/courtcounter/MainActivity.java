package com.example.animeshpatra.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int updateScoreTeamA;
    int updateScoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void threePointsToA(View view){
        updateScoreTeamA += 3;
        displayForTeamA(updateScoreTeamA);

    }

    public void twoPointsToA(View view){
        updateScoreTeamA += 2;
        displayForTeamA(updateScoreTeamA);

    }

    public void freeThrowToA(View view){
        updateScoreTeamA ++;
        displayForTeamA(updateScoreTeamA);

    }

    public void threePointsToB(View view){
        updateScoreTeamB += 3;
        displayForTeamB(updateScoreTeamB);
    }

    public void twoPointsToB(View view){
        updateScoreTeamB += 2;
        displayForTeamB(updateScoreTeamB);
    }

    public void freeThrowToB(View view){
        updateScoreTeamB ++;
        displayForTeamB(updateScoreTeamB);
    }

    public void resetScore(View view){
        updateScoreTeamA = 0;
        updateScoreTeamB = 0;
        displayForTeamA(updateScoreTeamA);
        displayForTeamB(updateScoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
}
