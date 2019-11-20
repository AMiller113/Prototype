package com.example.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopicChoiceActivity extends AppCompatActivity {

    Button t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_choice);

        t1 = findViewById(R.id.TopicButton1);
        t2 = findViewById(R.id.TopicButton2);
        t3 = findViewById(R.id.TopicButton3);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("topic", (t1.getText().toString()));
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("topic", (t2.getText().toString()));
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("topic", (t3.getText().toString()));
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
