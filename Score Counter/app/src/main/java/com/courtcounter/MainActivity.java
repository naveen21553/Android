package com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView FirstTeamScore;
    TextView SecondTeamScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstTeamScore = (TextView) findViewById(R.id.team_1_score);
        SecondTeamScore = (TextView) findViewById(R.id.team_2_score);
    }

    public void TeamOneScoreThree(View view){
        FirstTeamScore.setText(String.valueOf(Integer.parseInt(FirstTeamScore.getText().toString()) + 3));
    }
    public void TeamOneScoreTwo(View view){
        FirstTeamScore.setText(String.valueOf(Integer.parseInt(FirstTeamScore.getText().toString()) + 2));
    }
    public void TeamOneScoreOne(View view){
        FirstTeamScore.setText(String.valueOf(Integer.parseInt(FirstTeamScore.getText().toString()) + 1));
    }
    public void TeamTwoScoreThree(View view){
        SecondTeamScore.setText(String.valueOf(Integer.parseInt(SecondTeamScore.getText().toString()) + 3));
    }
    public void TeamTwoScoreTwo(View view){
        SecondTeamScore.setText(String.valueOf(Integer.parseInt(SecondTeamScore.getText().toString()) + 2));
    }
    public void TeamTwoScoreOne(View view){
        SecondTeamScore.setText(String.valueOf(Integer.parseInt(SecondTeamScore.getText().toString()) + 1));
    }

    public void ResetButton_Click(View view){
        FirstTeamScore.setText(String.valueOf(0));
        SecondTeamScore.setText(String.valueOf(0));
    }
}
