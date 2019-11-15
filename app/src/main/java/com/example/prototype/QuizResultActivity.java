package com.example.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizResultActivity extends AppCompatActivity {

    Button jumpIntoCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        jumpIntoCall = findViewById(R.id.TopicListButton);
        jumpIntoCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TopicChoiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
