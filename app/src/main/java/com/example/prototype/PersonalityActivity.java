package com.example.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class PersonalityActivity extends AppCompatActivity {

    Button prefButton, personalityButton,topicsButton,jumpIntoCall;
    CheckBox persCheckbox,prefCheckbox,topicCheckbox;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality);

        userData = UserData.getInstance();
        persCheckbox = findViewById(R.id.PersonalityCheckbox);
        prefCheckbox = findViewById(R.id.PreferencesCheckbox);
        topicCheckbox = findViewById(R.id.TopicsCheckbox);
        prefButton = findViewById(R.id.PreferenceButton);
        personalityButton = findViewById(R.id.PersonalityButton);
        topicsButton = findViewById(R.id.TopicsButton);
        jumpIntoCall = findViewById(R.id.randomButton);

        persCheckbox.setEnabled(false);
        prefCheckbox.setEnabled(false);
        topicCheckbox.setEnabled(false);

        if(userData.getPersonalityQuizCompleted()){
            persCheckbox.setChecked(true);
            }
        if(userData.getPreferencesQuizCompleted()){
            prefCheckbox.setChecked(true);
            }
        if(userData.getTopicsQuizCompleted()){
            topicCheckbox.setChecked(true);
            }

        prefButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                intent.putExtra("quiz_type","preferences");
                startActivity(intent);
            }
        });

        personalityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                intent.putExtra("quiz_type","personality");
                startActivity(intent);
            }
        });

        topicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                intent.putExtra("quiz_type","topics");
                startActivity(intent);
            }
        });

        jumpIntoCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TopicChoiceActivity.class);
                startActivity(intent);
            }
        });

    }


}
