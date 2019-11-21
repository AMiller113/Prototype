package com.example.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {

    //TODO Make checkboxes check when going back to personality activity

    Button submitButton;
    String quizType;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        userData = UserData.getInstance();
        quizType = getIntent().getExtras().getString("quiz_type");
        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (quizType){
                    case "personality":
                        userData.setPersonalityQuizCompleted(true);
                        userData.Save();
                        break;
                    case "preferences":
                        userData.setPreferencesQuizCompleted(true);
                        userData.Save();
                        break;
                    case "topics":
                        userData.setTopicsQuizCompleted(true);
                        userData.Save();
                        break;
                        default:
                            break;
                }
                startActivity(new Intent(getApplicationContext(), QuizResultActivity.class));
            }
        });
    }
}
