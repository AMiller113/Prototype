package com.example.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity {

    Button quizButton,randomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        quizButton = findViewById(R.id.QuizButton);
        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PersonalityActivity.class));
            }
        });

        randomButton = findViewById(R.id.randomButton);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                intent.putExtra("topic","Random");
                startActivity(intent);
            }
        });
    }
}
