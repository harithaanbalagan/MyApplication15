package com.example.ctadmin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioButton q2_option;
    int quizscore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button quizScore = (Button)findViewById(R.id.button);
        quizScore.setText(String.valueOf(quizScore));
        RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.q2_option);
        int selectedId2 = rbGroup2.getCheckedRadioButtonId();
        if (selectedId2 != -1) {
            RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId2);
            String radioButtonText2 = selectedRadioButton2.getText().toString();
            if ((radioButtonText2).equals(getString(R.string.q2answer))) {
                quizScore = (Button) findViewById(R.id.button);
                quizScore.setText(String.valueOf(quizScore));
                quizscore = quizscore + 1;
            }
        }

    }
}
