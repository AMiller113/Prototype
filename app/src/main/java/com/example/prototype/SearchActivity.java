package com.example.prototype;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    TextView currentTopic;
    Bundle bundle;
    private static int delayTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        currentTopic = findViewById(R.id.CurrentTopic);
        bundle = getIntent().getExtras();
        if(!bundle.equals(null)){
            currentTopic.setText((String) bundle.get("topic"));
        }
        else
            currentTopic.setText("Random");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), ConnectedActivity.class));
            }
        }, delayTime);
    }
}


